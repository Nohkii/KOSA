<template>
  <div class="card" style="width: 18rem; margin: auto">
    <img
      v-bind:src="srcUrl"
      class="card-img-top"
      width="70"
      height="200"
      alt="..."
    />
    <div class="card-body">
      <h5 class="card-title">{{ name }}</h5>
      <p class="card-text">{{ food }}</p>
      <button class="btn btn-primary" @click="handleClick">OK</button>
      <span>{{ datas.time }}</span>
    </div>
  </div>
</template>
<script setup>
import { defineProps, defineEmits } from "vue";
import { useWeatherStore } from "../stores/weather";
import { storeToRefs } from "pinia";
const emit = defineEmits(["deleteCard"]);
const weather = useWeatherStore();
let { datas } = storeToRefs(weather);
weather.createWeather();
console.log("datas.time"+datas.time);

const p = defineProps({
  name: String,
  food: {
    type: String,
    default: "떡볶이",
  },
  srcUrl: String,
  teamNum: String,
  num: Number,
});
async function handleClick() {
  emit("deleteCard", p.num);
  alert(datas.value);
}
</script>
