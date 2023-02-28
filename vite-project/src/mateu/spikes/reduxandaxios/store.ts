import {configureStore, createSlice, Dispatch} from '@reduxjs/toolkit'
import axios from "axios";


export interface State {
    loading: boolean,
    error: boolean,
    journeyTypes: [],
}

// initial state
export const initialState: State = {
    loading: false,
    error: false,
    journeyTypes: [],
};


const { actions: authActions, reducer: authReducer } = createSlice({
    name: 'tiposJourney',
    initialState,
    reducers: {
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
    },
})

const { setLoading, setJourneyTypes, setError } = authActions

const store = configureStore({
    reducer: {
        tiposJourney: authReducer
    }
})

export { store, setLoading, setJourneyTypes, setError }




// set up axios - simple json-server prototype config here
const api = axios.create({
    baseURL: "https://remote.mateu.io/mateu/v1",
    withCredentials: false,
    headers: {
        Accept: "application/json",
        "Content-Type": "application/json",
    },
});

export function fetchItems() {
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

