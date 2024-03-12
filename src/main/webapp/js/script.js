const imc = document.getElementById("imc");
const linhas = document.querySelectorAll(".container table tr");

let valor = imc.innerText.substring(8);

function colocarCor() {
    if(valor < 18.5){
        linhas[1].setAttribute("class", "fundo-azul");
    } else if(valor >= 18.5 && valor <= 24.9){
        linhas[2].setAttribute("class", "fundo-azul");
    } else if(valor >= 25 && valor <= 29.9){
        linhas[3].setAttribute("class", "fundo-azul");
    } else if(valor >= 30 && valor <= 39.9){
        linhas[4].setAttribute("class", "fundo-azul");
    } else {
        linhas[5].setAttribute("class", "fundo-azul");
    }
}

colocarCor();