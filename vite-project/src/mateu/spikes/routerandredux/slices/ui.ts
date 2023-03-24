import {createAsyncThunk, createSlice} from '@reduxjs/toolkit'
import axios from "axios";
import UI from '../../../dtos/UI'
import {router} from "../router";
import {Context} from "@vaadin/router";
import Menu from "../../../dtos/Menu";

const initialState = {
    loading: false,
    uiId: '',
    ui: {} as UI,
    error: '' as string | undefined
}

// First, create the thunk
export const loadUi = createAsyncThunk('ui/loadUi', (uiId) => {
    return axios
        .get('https://explorer.mateu.io/mateu/v1/uis/' + uiId)
        .then((response) => {
            console.log('received', response.data)
            return {
                uiId: uiId,
                ui: response.data as UI
            }
        })
})

function addRoutes(menu: Menu[]) {
    router.addRoutes(menu?.filter(m => m.journeyTypeId).map(m => {
                const route = {
                    path: '/router-and-redux.html/' + m.journeyTypeId,
                    name: m.journeyTypeId,
                    component: 'router-and-redux',
                    action: async (context: Context) => {
                        console.log('hola', context.route)
                        await import('../router-and-redux');
                    }
                };
                return route
            }
        )
    )
    menu?.filter(m => m.submenus).forEach(m => {
        if (m.submenus) addRoutes(m.submenus)
    });
}

const uiSlice = createSlice({
    name: 'ui',
    initialState,
    reducers: {
        // standard reducer logic, with auto-generated action types per reducer
    },
    extraReducers: builder => {
        // Add reducers for additional action types here, and handle loading state as needed
        builder.addCase(loadUi.pending, state => {
            state.loading = true
        })
        builder.addCase(loadUi.fulfilled, (state, action) => {
            console.log('action', action)
            state.loading = false
            // @ts-ignore
            state.uiId = action.payload.uiId
            state.ui = action.payload.ui
            state.error = ''

            addRoutes(state.ui.menu);
        })
        builder.addCase(loadUi.rejected, (state, action) => {
            state.loading = false
            state.ui = {} as UI
            state.error = action.error.message
        })
    }
})

export default uiSlice

// Later, dispatch the thunk as needed in the app
//dispatch(loadUi('com.example.demoremote.ui.DemoApp'))
