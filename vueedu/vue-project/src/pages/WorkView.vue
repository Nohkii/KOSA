<template>
  <h2 style="color: #3f51b5">노은기의 Vue 실습 페이지</h2>
  <br />
  <div style="display: flex">
    <TeamCard
      name="문호준"
      food="베이컨토마토디럭스버거"
      srcUrl="images/moon.png"
      teamNum="1"
      @display-teamcard="displayTeamcard"
      v-if="isShow"
    ></TeamCard>
    <TeamCard
      name="노은기"
      food="소금빵 까눌레"
      srcUrl="images/noh.png"
      teamNum="2"
      @display-teamcard="displayTeamcard"
      v-if="isShow"
    ></TeamCard>
    <TeamCard
      name="손승범"
      food="라멘 마라탕"
      srcUrl="images/son.png"
      teamNum="3"
    ></TeamCard>
    <TeamCard
      name="이해성"
      food="맥도날드 감자튀김"
      srcUrl="images/sung.jpg"
      teamNum="4"
    ></TeamCard>
  </div>
</template>
<script setup>
import TeamCard from "@/components/TeamCard.vue";
import { ref } from "vue";
const isShow = ref(true);
function displayTeamcard(data) {
  
  console.log(data);
  console.log(isShow.value);
  isShow.value = data;
}
</script>
