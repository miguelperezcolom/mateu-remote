import { createSlice, configureStore } from '@reduxjs/toolkit'

const { actions: authActions, reducer: authReducer } = createSlice({
    name: 'isAuthenticated',
    initialState: false,
    reducers: {
        signIn: () => true,
        signOut: () => false
    }
})

const { signIn, signOut } = authActions

const store = configureStore({
    reducer: {
        isAuthenticated: authReducer
    }
})

export { store, signIn, signOut }
