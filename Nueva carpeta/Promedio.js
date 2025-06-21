function Calcularpromedio (n1, n2, n3){

    let promedio  = (n1+n2+n3)/ 3;
    return promedio;
    
}
    let n = prompt("dijite el numero 1:");
    let m = prompt("dijite el numero 2");
    let s = prompt("dijite el numero 3");
    let resultado = Calcularpromedio(n,m,s);
    console.log(resultado);
    alert(resultado);

    function Aprobado (promedio){
        if (promedio>= 3)
            return true

        if (promedio< 3)
            return false

    }
   let p = Aprobado(resultado);
    alert(p);