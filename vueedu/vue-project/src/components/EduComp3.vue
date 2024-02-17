<template>
	<div>
		<button @click="increment()">Counter: {{ counter }}</button>
	</div>
</template>

<script>
import { onMounted, ref } from 'vue';

export default {
	setup() {
		const counter = ref(0); // 내부적으로 반응형 객체로 만듦
		const increment = () => counter.value++; // 메서드
		onMounted(() => { // mount되면~ 실행해라~
			console.log('애플리케이션이 마운트 되었습니다!');
		});
		return {
			counter,
			increment,
		};
	},
};
</script>