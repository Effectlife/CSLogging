
<!--<template><div></div></template>-->

<template src="./CharacterSheet.html"/>

<style scoped>
th {
  width: 10em;
}
</style>
<script lang="ts">
import api from "@/api/backend-api";
import {AxiosError} from "axios";
import {defineComponent} from 'vue';

let interval: number;

interface State {
  ch: any;
}

export default defineComponent({
  name: "CharacterSheet",
  props: {
    charId: {
      type: String,
      required: true
    }
  },
  mounted(): void {
    this.getCharacter();
    interval = setInterval(this.getCharacter, 5000);
  },
  methods: {
    // Fetches posts when the component is created.
    getCharacter(): void {
      api.getCharacter(this.charId).then(response => {
        let data: any = response.data;
        this.$data.ch = data;
        console.log(this.$data.ch);
      })
          .catch((error: AxiosError) => {
            console.log(error)
          })
    }
  },
  data: (): State => {
    return {
      ch:[]
    }
  }, beforeUnmount(): void {
    clearInterval(interval);
  },
})
</script>