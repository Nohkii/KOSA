// stores/counter.js
import { defineStore } from 'pinia'
import { ref, computed } from 'vue'

export const useCounterStore = defineStore('counter', () => { // State 역할 
  // counter함수 만들고 안에 전역적으로 사용할 수 있는 데이터들 넣기
    const count = ref(0);
    const name = ref('유니코');
    const logo = '/images/pinialogo.png'; // 로고는 그냥 정적데이터로,,
    
    const myInfo = computed(() => `이름은 ${name.value} 입니다`); // Getter 역할
   
    function increment() { //Action 역할
      count.value++
    }
    return { count, name, logo, myInfo, increment }
  },
)

/*
Option API 방식의 스토아 구현
export const useCounterStore = defineStore('counter', {
  state: () => {
    return { count: 0, name: '유니코', logo: '/images/pinialogo.png' }
  },
  getters: {
    myInfo: (state) => {
      return `이름은 ${state.name} 입니다`;
    }
  },
  actions: {
    increment() {
      this.count++
    },
  },
})*/
