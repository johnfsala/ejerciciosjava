function Bonificacion(salario) {
    return salario * 0.10;
}
 let m = prompt("dijite el salario");
 let resultado = Bonificacion(m);
 console.log(resultado);
 alert(resultado);

 function alto(bonificacion){
    if (bonificacion>= 100){
        console.log("bonificacion alta")
        return true
        
    }
    if (bonificacion< 100){
        console.log("bonificacion baja")
        return false
        
    }
 }
 let p = alto(resultado);
 alert(p);

