import { configureStore } from '@reduxjs/toolkit'
import uiSlice from "./slices/ui";

const store = configureStore({
    reducer: {
        ui: uiSlice.reducer
    }
})

export { store }
