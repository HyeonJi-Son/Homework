<template>
    <div align="center">
        <h2>Vue + Spring 게시판 읽기</h2>
        <board-read v-if="board" :board="board"/>
        <p v-else>로딩중 ....... </p>
        <router-link :to="{ name: 'BoardModifyPage', params: { boardNo } }">
            게시물 수정
        </router-link>
        <button @click="onDelete">삭제</button>
        <router-link :to="{ name: 'BoardListPage' }">
            게시물 보기
        </router-link>
    </div>
</template>

<script>

import axios from 'axios'
import { mapActions, mapState } from 'vuex'
import BoardRead from '@/components/board/BoardRead.vue'

//v-bind가 없어도 props를 통해 값이 넘어오고 있음.
//이것이 가능한 이유는? props가 defalt(true)로 승인되고 있기 때문

export default {
    name: 'BoardReadPage',
    props: {
        boardNo: {
            type: String,
            required: true
        }
    },
    components: {
        BoardRead
    },
    computed: {
        ...mapState(['board'])
    },
    created () {
        this.fetchBoard(this.boardNo)
                .catch(() => {
                    alert('게시물 요청 실패!')
                    this.$router.push()
                })
    },
    methods: {
        ...mapActions(['fetchBoard']),
        onDelete () {
            const { boardNo } = this.board
            //alert('지우는 게시물 번호: ' + boardNo)
            axios.delete(`http://localhost:7777/order49/vueboard/${boardNo}`)
                    .then(() => {
                        alert('삭제 성공!')
                        this.$router.push({ name: 'BoardListPage' })
                    })
                    .catch(() => {
                        alert('삭제 실패! 문제 발생!')
                    })
        }
    }
}

</script>