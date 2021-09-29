<template>
  <div class="attr-container">
    <p class="btn ui-draggable">{{ skillName }}</p>
    <span class="attr">{{ skillMod }}</span>
    <div class="attr-mod finalattr"> {{ skillValue }}</div>
  </div>
</template>

<script lang="ts">
import {defineComponent} from "vue";

export default defineComponent({
  name: "MiniSkillComponent",
  props: {
    skillName: {
      type: String,
      required: true
    }, skillMod: {
      type: String,
      required: true
    }, skillValue: {
      type: String,
      required: true
    },

  }
})
</script>

<style scoped>
.attr-mod {
  top: -10px;
}

.attr-container {
  background: url(https://app.roll20.net/images/dndstyling/ability-STR.svg);
  width: 70px;
  border: 0;
  margin: 0 !important;
  margin-top: 20px !important;
  background-position: top center !important;
  background-repeat: no-repeat !important;
  background-size: contain !important;
  border-radius: 5px;
  position: relative;
  padding-bottom: 10px;
  height: 64px;
  text-align: center;
  box-sizing: content-box;
}

.attr {
  font-size: 35px;
  font-weight: bold;
  position: relative;
  top: -15px;
  line-height: 40px;
  box-sizing: content-box;
}

.btn {
  top:5px;
  background-color: transparent;
  color: black;
  border: none;
  line-height: 15px;
  background-image: none;
  text-shadow: none;
  box-shadow: none;
  width: 100%;
  font-weight: bold;
  overflow: hidden;
  font-size: 6.5px !important;
}

.finalattr {
  font-size: 18px !important;
  line-height: 10px;
  box-sizing: content-box;
  text-align: center;
}


</style>