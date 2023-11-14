import { defineStore } from "pinia";
import { ref, computed } from "vue";

export const useListStore = defineStore("list", () => {
  const list = ref([]); // 비어있는 리스트 반응성으로
  function addList(param) {
    list.value.push(param);
    // list.value -> 배열객체
  }
  const getDataAll = computed(() => list.value);
  return { list, addList, getDataAll };
});
