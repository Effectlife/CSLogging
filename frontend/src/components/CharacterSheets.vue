<template>
  <div class="hello">
    <div ref="sheets">
      <CharacterSheet :id="char" v-for="char in characters" :key="char" v-bind:char-name="char" style="display: block"/>
    </div>
  </div>
</template>

<script lang="ts">
import CharacterSheet from "@/components/CharacterSheet";
import api from "@/api/backend-api";
import {AxiosError} from "axios";
import { defineComponent } from 'vue';

let interval: number;

interface State {
  characters: string[];
}

export default defineComponent({
  name: 'CharacterSheets',
  props: {
    hellomsg: {
      type: String,
      required: false
    }
  },
  components: {
    CharacterSheet
  },
  mounted(): void {
    this.getCharacterNames();
    interval = setInterval(this.getCharacterNames, 1000);
  },
  methods: {
    // Fetches posts when the component is created.
    getCharacterNames(): void {
      api.getAllNames().then(response => {
        this.characters = response.data;
        console.log(this.characters);
      })
          .catch((error: AxiosError) => {
            this.errors.push(error)
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
