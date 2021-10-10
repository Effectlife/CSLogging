<template>
  <div class="home">
    <CharacterSheets/>
  </div>
</template>

<script lang="ts">
import {defineComponent} from 'vue';
import CharacterSheets from "@/components/CharacterSheets.vue"; // @ is an alias to /src

export default defineComponent({
  name: 'Home',
  components: {
    CharacterSheets
  },
});
</script>

