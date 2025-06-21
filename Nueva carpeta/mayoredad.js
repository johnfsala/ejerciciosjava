function EsMayorDeEdad (edad){
    if(edad>= 18){
        alert("es mayor de edad")
        return true
    }else{
        alert("es menor")
        return false
    }
}   
let m = prompt("dijite su edad")
    EsMayorDeEdad(m)
