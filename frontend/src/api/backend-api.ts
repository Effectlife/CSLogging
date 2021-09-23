import axios, {AxiosResponse} from 'axios'

const axiosApi = axios.create({
    baseURL: `/api`,
    timeout: 1000,
    headers: { 'Content-Type': 'application/json' }
});


export default {
    hello(): Promise<AxiosResponse<string>> {
        return axiosApi.get(`/hello`);
    }
}


