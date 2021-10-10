<template>
  <div class="container">
    <h2>Character sheets for Roll20</h2>
    <p>Click on header for more details for the character</p>
    <CharacterSheet :id="char" v-for="char in characters" :key="char" v-bind:char-id="char"
                    style="display: block"/>
  </div>
</template>

<script lang="ts">
import CharacterSheet from "@/components/CharacterSheet.vue";
import api from "@/api/backend-api";
import {AxiosError} from "axios";
import {defineComponent} from 'vue';

let interval: number;

interface State {
  characters: any;
}

export default defineComponent({
  name: 'CharacterSheets',
  components: {
    CharacterSheet
  },
  mounted(): void {
    this.getCharacterNames();
    interval = setInterval(this.getCharacterNames, 5000);
  },
  methods: {
    // Fetches posts when the component is created.
    getCharacterNames(): void {
      api.getAllNames().then(response => {
        this.characters = response.data;
      }).catch((error: AxiosError) => {
        console.log(error)
      })
    }
  }, data: (): State => {
    return {
      characters: []
    }
  }, beforeUnmount(): void {
    clearInterval(interval);
  },
})
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
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
