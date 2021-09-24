<template>
  <div class="service">

    <button @click="getCharacterNames()">Get Characters</button>

    <h4>Backend response: {{ backendResponse }}</h4>

  </div>
</template>

<script lang="ts">
import {defineComponent} from 'vue';
import api from "../api/backend-api";
import {AxiosError} from "axios";

interface State {
  backendResponse: string;
  characterNames: string[];
  errors: AxiosError[]
}

let interval: number;

export default defineComponent({
  name: 'Service',
  mounted() {
    console.log("mounted");
    interval = setInterval(this.getCharacterNames, 1000);
  },
  data: (): State => {
    return {
      backendResponse: '',
      characterNames: [],
      errors: []
    }
  },
  beforeUnmount() {
    clearInterval(interval);
  },
  methods: {
    // Fetches posts when the component is created.
    getCharacterNames() {
      api.getAllNames().then(response => {
        this.backendResponse = response.data.toString();
        console.log(response.data)
      })
          .catch((error: AxiosError) => {
            this.errors.push(error)
          })
    }
  }
});
</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  display: inline-block;
  margin: 0 10px;
}

a {
  color: #42b983;
}
</style>
