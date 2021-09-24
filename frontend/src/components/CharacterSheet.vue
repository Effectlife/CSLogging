<template>
  <div class="content" v-bind:id="charName">

    <table class="table is-narrow is-hoverable">
      <tbody>
      <tr>
        <th>Name</th>
        <td>{{charName}}</td>
      </tr>
      <tr>
        <th>Strength</th>
        <td>{{ strength }}</td>
      </tr>
      <tr>
        <th>Dexterity</th>
        <td>{{ dexterity }}</td>
      </tr>
      <tr>
        <th>Constitution</th>
        <td>{{ constitution }}</td>
      </tr>
      <tr>
        <th>Intelligence</th>
        <td>{{ intelligence }}</td>
      </tr>
      <tr>
        <th>Wisdom</th>
        <td>{{ wisdom }}</td>
      </tr>
      <tr>
        <th>Charisma</th>
        <td>{{ charisma }}</td>
      </tr>
      </tbody>
    </table>

  </div>
</template>
<style scoped>
th{
  width: 10em;
}
</style>
<script lang="ts">

import api from "@/api/backend-api";
import {AxiosError} from "axios";
import { defineComponent } from 'vue';

let interval: number;

interface State {
  charisma: number;
  constitution: number;
  dexterity: number;
  strength: number;
  wisdom: number;
  intelligence: number;
}

export default defineComponent( {
  name: "CharacterSheet",
  props: {
    charName: {
      type: String,
      required: true
    }
  },
  mounted(): void {
    this.getCharacter();
    interval = setInterval(this.getCharacter, 1000);
  },
  methods: {
    // Fetches posts when the component is created.
    getCharacter(): void {
      api.getCharacter(this.charName).then(response => {
        this.$data.charisma = response.data.charisma;
        this.$data.constitution = response.data.constitution;
        this.$data.dexterity = response.data.dexterity;
        this.$data.strength = response.data.strength;
        this.$data.wisdom = response.data.wisdom;
        this.$data.intelligence = response.data.intelligence;
        console.log(response.data);
      })
          .catch((error: AxiosError) => {
            this.errors.push(error)
          })
    }
  },
  data: (): State => {
    return {
      charisma: 0,
      constitution: 0,
      dexterity: 0,
      strength: 0,
      wisdom: 0,
      intelligence: 0,
    }
  }, beforeUnmount(): void {
    clearInterval(interval);
  },
})
</script>

