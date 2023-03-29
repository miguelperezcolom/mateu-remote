import { defineConfig } from 'vite'

// https://vitejs.dev/config/
export default defineConfig({
  build: {
    lib: {
      entry: 'src/my-custom-element.ts',
      formats: ['es'],
    },
    rollupOptions: {
      /*
      external: /^lit/,
       */

      output: {
        entryFileNames: `assets/custom-elements.js`,
        chunkFileNames: `assets/[name].js`,
        assetFileNames: `assets/[name].[ext]`
      }

    },
  },
})
