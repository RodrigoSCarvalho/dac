/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var btnProsseguir ;
var divCat;
var divLanc;
var btnVoltar;

btnProsseguir = document.getElementById("hidenJs");
divCat = document.getElementById("divCategoria");    
divLanc = document.getElementById("divLancamento");
btnVoltar = document.getElementById("showJs");

divLanc.classList.add("hidenDiv");

btnProsseguir.onclick = esconderDiv;
btnVoltar.onclick = mostrarDiv;

function esconderDiv(){
    divCat.classList.add("hidenDiv");
    divCat.classList.remove("showDiv")
    divLanc.classList.remove("hidenDiv");
    divLanc.classList.add("showDiv");
};
function mostrarDiv(){
    divLanc.classList.add("hidenDiv");
    divLanc.classList.remove("showDiv")
    divCat.classList.remove("hidenDiv");
    divCat.classList.add("showDiv");
};

/*
window.onload = function(){
var btnProsseguir = document.querySelector('#hidenJs');
var formularioEsconder = document.querySelector('.hidenJs');

btnProsseguir.addEventListener('click', function(){
    
    if(formularioEsconder.style.display === 'block'){
        formularioEsconder.style.display = 'none';
    }
});

};
*/