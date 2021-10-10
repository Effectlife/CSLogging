<!--<template><div></div></template>-->

<template src="./CharacterSheet.html"/>

<style scoped>

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
      })
          .catch((error: AxiosError) => {
            console.log(error)
          })
    },
    toggleAcc(event: any): void {

      function findAncestor(el: Element, tag: string): any {
        if (el.nodeName.toLowerCase() == tag.toLowerCase() || !el.parentElement) return el;
        return findAncestor(el.parentElement, tag);
      }

      var panel: HTMLElement;
      panel = findAncestor(event.target, 'tr') as HTMLElement;
      panel = Array.from(panel.querySelectorAll(".acc-panel"))[0] as HTMLElement;
      if (panel.style.display === "block") {
        panel.style.display = "none";
      } else {
        panel.style.display = "block";
      }
    },
    toggleAccMain(event: any): void {

      function findAncestor(el: Element, cls: string): any {
        if (el.classList.contains(cls) ||!el.parentElement) return el;
        return findAncestor(el.parentElement, cls);
      }

      var panel: HTMLElement;
      panel = findAncestor(event.target, 'container') as HTMLElement;
      let panels = Array.from(panel.querySelectorAll(".acc-panel-main")) as HTMLElement[];
      console.log(panel);
      console.log(panels.length);
      for (let i = 0; i < panels.length; i++) {
        if (panels[i].style.display === "block") {
          panels[i].style.display = "none";
        } else {
          panels[i].style.display = "block";
        }
      }


    }
  },
  data: (): State => {
    return {
      ch: []
    }
  }, beforeUnmount(): void {
    clearInterval(interval);
  },
})
</script>