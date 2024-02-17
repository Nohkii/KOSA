<template>
  <h2 style="color: #3f51b5">노은기의 Vue 실습 페이지</h2>
  <br />
  <div style="display: flex">
    <TeamCard
      name="문"
      food="베이컨토마토디럭스버거"
      srcUrl="images/moon.png"
      teamNum="4"
      num="0"
      @deleteCard="deleteCard"
      v-if="isShow[0]"
    ></TeamCard>
    <TeamCard
      name="노"
      food="소금빵 까눌레"
      srcUrl="images/noh.png"
      teamNum="4"
      num="1"
      @deleteCard="deleteCard"
      v-if="isShow[1]"
    ></TeamCard>
    <TeamCard
      name="손"
      food="라멘 마라탕"
      srcUrl="images/son.png"
      teamNum="3"
      num="2"
      v-if="isShow[2]"
      @deleteCard="deleteCard"
    ></TeamCard>
    <TeamCard
      name="이"
      food="맥도날드 감자튀김"
      srcUrl="images/sung.jpg"
      teamNum="4"
      num="3"
      v-if="isShow[3]"
      @deleteCard="deleteCard"
    ></TeamCard>
  </div>
</template>
<script setup>
import TeamCard from "@/components/TeamCard.vue";
import { reactive, ref } from "vue";
import { storeToRefs } from "pinia";
import { useWeatherStore } from "../stores/weather";
const isShow = reactive([true, true, true, true]);

function deleteCard(data) {
  isShow[data] = false;
}
</script>
