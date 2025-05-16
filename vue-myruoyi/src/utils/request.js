import axios from "axios"

const service = axios.create({
    baseURL: "",
    timeout: 5000

})
// 请求拦截器
service.interceptors.request.use(
    config => {
        //发送请求前做些什么
        return config
    },
    error => {
        console.log("request error:" + error)
        return Promise.reject(error)
    }
)
service.interceptors.response.use(
    response =>{
        return response.data
    },
    error => {
        console.log("response error:" + error)
        return Promise.reject(error)
    }
)
export default service