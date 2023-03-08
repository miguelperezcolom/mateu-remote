import {configureStore, createSlice, Dispatch} from '@reduxjs/toolkit'
import axios from "axios";
import Step from "../../dtos/Step";
import JourneyCreationRq from "../../dtos/JourneyCreationRq";
import RunActionRq from "../../dtos/RunActionRq";
import Journey from "../../dtos/Journey";
import UI from "../../dtos/UI";


export interface State {
    loading: boolean,
    error: boolean,
    ui: UI | undefined,
    journeyTypes: [] | undefined,
    journeyType: string | undefined,
    journeyId: string | undefined,
    journey: Journey | undefined,
    stepId: string | undefined,
    step: Step | undefined,
    completed: boolean,
    items: [] | undefined,
    matches: number | undefined,
}

// initial state
export const initialState: State = {
    loading: false,
    error: false,
    ui: undefined,
    journeyTypes: undefined,
    journeyType: undefined,
    journeyId: undefined,
    journey: undefined,
    stepId: undefined,
    step: undefined,
    completed: false,
    items: undefined,
    matches: undefined,
};


const { actions: authActions, reducer: authReducer } = createSlice({
    name: 'tiposJourney',
    initialState,
    reducers: {
        reset: (state) => {
            console.log('resetting', state);
            return initialState;
        },
        setLoading: (state) => {
            state.loading = true;
        },
        setJourneyTypes: (state, { payload }) => {
            console.log('payload', payload)
            state.loading = false;
            state.error = false;
            state.journeyTypes = payload;
        },
        setError: (state) => {
            state.error = true;
        },
        setJourneyType: (state, { payload }) => {
            state.journeyType = payload;
            state.loading = false;
            state.error = false;
            state.journeyId = undefined;
            state.journey = undefined;
            state.stepId = undefined;
            state.step = undefined;
            state.completed = false;
        },
        setJourneyId: (state, { payload }) => {
            state.journeyId = payload;
        },
        setJourney: (state, { payload }) => {
            state.journey = payload;
            if (state.journey!.currentStepId) {
                state.stepId = state.journey!.currentStepId
            } else {
                state.completed = true;
            }
        },
        setStep: (state, { payload }) => {
            const step = payload as Step;
            state.step = step;
        },
        completeStep: (state) => {
            console.log(state)
            state.step = undefined;
            state.stepId = undefined;
            state.journey = undefined;
            // call api to get status
            // call api to get step
        },
        setUi: (state, { payload }) => {
            state.ui = payload;
        },
        setCount: (state, { payload }) => {
            state.matches = payload;
        },
        setRows: (state, { payload }) => {
            console.log('setRows', payload)
            state.items = payload;
        },
    },
})

const { reset, setLoading, setJourneyTypes, setError, setJourneyType, setJourneyId, setJourney, setStep, completeStep, setUi, setCount, setRows } = authActions

const store = configureStore({
    reducer: {
        tiposJourney: authReducer
    }
})

export { store, reset, setLoading, setJourneyTypes, setError, setJourneyType, setJourneyId, setJourney, setStep, completeStep, setUi, setCount, setRows }

declare global {
    interface Window {
        __MATEU_REMOTE_BASE_URL__:any;
    }
}

// set up axios - simple json-server prototype config here
const api = axios.create({
    baseURL: window.__MATEU_REMOTE_BASE_URL__?window.__MATEU_REMOTE_BASE_URL__:"https://remote.mateu.io/mateu/v1",
    withCredentials: false,
    headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
    },
});

export function fetchItems() {

    console.log('fetchItems');

    return async (dispatch: Dispatch) => {
        api
            .get("/journey-types")
            .then((response) => {
                dispatch(setJourneyTypes(response.data));
            })
            .catch((error) => {
                console.log(error)
                dispatch(setError());
            });
    };
}

export function createJourney(journeyTypeId: string, journeyId: string) {

    console.log('createJourney', journeyTypeId, journeyId);

    const rq: JourneyCreationRq = {
        journeyTypeId,
        contextData: []
    };

    return async (dispatch: Dispatch) => {
        api
            .post("/journeys/" + journeyId, rq)
            .then((response) => {
                console.log(response)
                dispatch(setJourneyId(journeyId));
            })
            .catch((error) => {
                console.log(error)
                dispatch(setError());
            });
    };
}

export function getJourneyStatus(journeyId: string) {

    console.log('getJourneyStatus', journeyId);

    return async (dispatch: Dispatch) => {
        api
            .get("/journeys/" + journeyId)
            .then((response) => {
                dispatch(setJourney(response.data));
            })
            .catch((error) => {
                console.log(error)
                dispatch(setError());
            });
    };
}

export function getStep(journeyId: string, stepId: string) {

    console.log('getStep', journeyId, stepId);

    return async (dispatch: Dispatch) => {
        api
            .get("/journeys/" + journeyId + "/steps/" + stepId)
            .then((response) => {
                dispatch(setStep(response.data));
            })
            .catch((error) => {
                console.log(error)
                dispatch(setError());
            });
    };
}


export function runStepAction(journeyId: string, stepId: string, actionId: string, data: object) {

    console.log('runStepAction', journeyId, stepId, actionId, data);

    const rq: RunActionRq = {
        data: data
    };

    return async (dispatch: Dispatch) => {
        api
            .post("/journeys/" + journeyId + "/steps/" + stepId + "/" + actionId, rq)
            .then((response) => {
                dispatch(completeStep(response.data));
            })
            .catch((error) => {
                console.log(error)
                dispatch(setError());
            });
    };
}

export function getUi(uiId: string) {

    console.log('getUi', uiId);

    return async (dispatch: Dispatch) => {
        api
            .get("/uis/" + uiId)
            .then((response) => {
                dispatch(setUi(response.data));
            })
            .catch((error) => {
                console.log(error)
                dispatch(setError());
            });
    };
}


export function getCount(journeyId: string, stepId: string, listId: string, filters: string) {

    console.log('getCount', journeyId, stepId);

    return async (dispatch: Dispatch) => {
        api
            .get("/journeys/" + journeyId + "/steps/" + stepId + "/lists/" + listId + "/count?filters=" + filters)
            .then((response) => {
                dispatch(setCount(response.data));
            })
            .catch((error) => {
                console.log(error)
                dispatch(setError());
            });
    };
}

export function getRows(journeyId: string, stepId: string, listId: string, filters: string) {

    console.log('getRows', journeyId, stepId);

    return async (dispatch: Dispatch) => {
        api
            .get("/journeys/" + journeyId + "/steps/" + stepId + "/lists/" + listId + "/rows?page=0&page_size=10&ordering=filters=" + filters)
            .then((response) => {
                dispatch(setRows(response.data));
            })
            .catch((error) => {
                console.log(error)
                dispatch(setError());
            });
    };
}
