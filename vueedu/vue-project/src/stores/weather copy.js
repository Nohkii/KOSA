import { api } from "../common";
import { defineStore } from "pinia";

export const useWeatherStore = defineStore("weather", () => {
  let createWeather = api("http://localhost:8088/weather", "get");
  console.log(createWeather);
  return { createWeather };
});
// common 사용 방법
