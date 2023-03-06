import { defineConfig } from 'vite'

// https://vitejs.dev/config/
export default defineConfig({
  build: {
    // lib: {
    //   entry: 'src/mateu/spikes/starter/journey-starter.ts',
    //   formats: ['es'],
    // },
    rollupOptions: {
      //external: /^lit/,
    },
  },
})
