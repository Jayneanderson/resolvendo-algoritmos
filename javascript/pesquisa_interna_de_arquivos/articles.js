/* 
    O que eu preciso? 

    Preciso carregar uma lista de artigos estáticos
        Digitando uma palavra toda?
        Não, enquanto digito.
        Logo, preciso criar algo que fique buscando enquanto eu digito.
*/

const articles = [
    {
        title: "Introdução a Programação",
        link: "introducao-a-programacao-livro-v1.0.2.pdf"
    },
    {
        title: "Impactos do ensino remoto na disciplina paradigmas de programação",
        link: "Impactos do ensino remoto na disciplina paradigmas de programação.pdf"
    },
    {
        title: "Controle de Versão usando Git",
        link: "Controle de Versão usando Git.pdf"
    }
]

const title = document.getElementById('title')
const listArticles = document.getElementById('articles')


title.addEventListener('keyup', search);

function search() {

    //Aqui estamos ativando a função a cada letra. Se houver o trecho da String, coloque esse elemento dentro da lista
    const founds = articles.filter(element => {
        return element.title.toLowerCase().indexOf(title.value.toLowerCase()) != -1 //aqui eu comparo se o meu título é igual ao valor que está digitado no campo
    });

    listArticles.innerHTML = " " //Aqui é para apagar todos os resultados e deixar apenas 1 (encontrado)
    for (found of founds) {
        
        listArticles.insertAdjacentHTML("beforeend", `<li><a href="articles/${found.link}">${found.title}</a></li>`)
    }

    // if(title.value == '') {
    //     listArticles.innerHTML = ""
    // }

}
