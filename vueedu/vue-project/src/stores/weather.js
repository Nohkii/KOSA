import axios from "axios";
import { ref } from "vue";
import { defineStore } from "pinia";

export const useWeatherStore = defineStore("weather", () => {
  let datas = ref("");

  function createWeather() {
    axios
      .get("http://localhost:8088/weather")
      .then((response) => {
        datas.value = response.data;
        console.log(datas);
        return response.data;
      })
      .catch((err) => console.log(err));
  }
  return { datas, createWeather };
});
