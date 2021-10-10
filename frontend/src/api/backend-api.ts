import axios, {AxiosResponse} from 'axios'

const axiosApi = axios.create({
    baseURL: `/api`,
    timeout: 1000,
    headers: {'Content-Type': 'application/json'}
});


class Character {

    constructor(charisma: number, constitution: number, dexterity: number, name: string, strength: number, wisdom: number) {
        this._charisma = charisma;
        this._constitution = constitution;
        this._dexterity = dexterity;
        this._name = name;
        this._strength = strength;
        this._wisdom = wisdom;
    }

    private _charisma: number;
    private _constitution: number;
    private _dexterity: number;
    private _name: string;
    private _strength: number;
    private _wisdom: number;

    get charisma(): number {
        return this._charisma;
    }

    set charisma(value: number) {
        this._charisma = value;
    }

    get constitution(): number {
        return this._constitution;
    }

    set constitution(value: number) {
        this._constitution = value;
    }

    get dexterity(): number {
        return this._dexterity;
    }

    set dexterity(value: number) {
        this._dexterity = value;
    }

    get name(): string {
        return this._name;
    }

    set name(value: string) {
        this._name = value;
    }

    get strength(): number {
        return this._strength;
    }

    set strength(value: number) {
        this._strength = value;
    }

    get wisdom(): number {
        return this._wisdom;
    }

    set wisdom(value: number) {
        this._wisdom = value;
    }
}

export default {

    getCharacter(charname: string): Promise<AxiosResponse<string>> {
        return axiosApi.get('/getCharacter?characterId=' + charname);
    },

    getAllNames(): Promise<AxiosResponse<Character>> {
        return axiosApi.get('/getAllNames');
    }
}


