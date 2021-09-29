<template>
  <div class="content" v-bind:id="charName">

    <table class="table is-narrow is-hoverable">
      <tbody>
      <tr>
        <th>Name</th>
        <td>{{ name }}</td>
      </tr>
      <!--      <tr>-->
      <!--        <th>Strength</th>-->
      <!--        <td>{{ strength }}</td>-->
      <!--      </tr>-->
      <!--      <tr>-->
      <!--        <th>Dexterity</th>-->
      <!--        <td>{{ dexterity }}</td>-->
      <!--      </tr>-->
      <!--      <tr>-->
      <!--        <th>Constitution</th>-->
      <!--        <td>{{ constitution }}</td>-->
      <!--      </tr>-->
      <!--      <tr>-->
      <!--        <th>Intelligence</th>-->
      <!--        <td>{{ intelligence }}</td>-->
      <!--      </tr>-->
      <!--      <tr>-->
      <!--        <th>Wisdom</th>-->
      <!--        <td>{{ wisdom }}</td>-->
      <!--      </tr>-->
      <!--      <tr>-->
      <!--        <th>Charisma</th>-->
      <!--        <td>{{ charisma }}</td>-->
      <!--      </tr>-->
      </tbody>
    </table>

    <MiniSkillComponent v-bind:skillValue="strength" skillName="STRENGTH" v-bind:skillMod="strengthMod"/>

  </div>
</template>
<style scoped>
th {
  width: 10em;
}
</style>
<script lang="ts">
import MiniSkillComponent from "@/components/micro/MiniSkillComponent.vue"
import api from "@/api/backend-api";
import {AxiosError} from "axios";
import {defineComponent} from 'vue';

let interval: number;

interface State {
  name: string;
  charisma: number;
  charismaMod: number;
  constitution: number;
  constitutionMod: number;
  dexterity: number;
  dexterityMod: number;
  strength: number;
  strengthMod: number;
  wisdom: number;
  wisdomMod: number;
  intelligence: number;
  intelligenceMod: number;
}

export default defineComponent({
  name: "CharacterSheet",
  props: {
    charName: {
      type: String,
      required: true
    }
  },
  components: {
    MiniSkillComponent
  },
  mounted(): void {
    this.getCharacter();
    interval = setInterval(this.getCharacter, 1000);
  },
  methods: {
    // Fetches posts when the component is created.
    getCharacter(): void {
      api.getCharacter(this.charName).then(response => {
        let data: any = response.data;
        this.$data.name = data.name;
        this.$data.charisma = data.charisma;
        this.$data.charismaMod = data.charisma_mod;
        this.$data.constitution = data.constitution;
        this.$data.constitutionMod = data.constitution_mod;
        this.$data.dexterity = data.dexterity;
        this.$data.dexterityMod = data.dexterity_mod;
        this.$data.strength = data.strength;
        this.$data.strengthMod = data.strength_mod;
        this.$data.wisdom = data.wisdom;
        this.$data.wisdomMod = data.wisdom_mod;
        this.$data.intelligence = data.intelligence;
        this.$data.intelligenceMod = data.intelligence_mod;
        console.log(data);
      })
          .catch((error: AxiosError) => {
            console.log(error)
          })
    }
  },
  data: (): State => {
    return {
      name: '',
      charisma: 0, charismaMod: 0,
      constitution: 0, constitutionMod: 0,
      dexterity: 0, dexterityMod: 0,
      strength: 0, strengthMod: 0,
      wisdom: 0, wisdomMod: 0,
      intelligence: 0, intelligenceMod: 0,
    }
  }, beforeUnmount(): void {
    clearInterval(interval);
  },
})
</script>

