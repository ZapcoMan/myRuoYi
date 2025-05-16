import './assets/main.css'

import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import axios from 'axios'
import 'element-plus'
const app = createApp(App)

// 全局注册ElementPlus组件
app.use(ElementPlus)

// 将axios挂载到全局
app.config.globalProperties.$axios = axios

app.use(router)
app.mount('#app')