<?php
    $DDD = fgets(STDIN);
    /**/
    switch($DDD){
        case 11: 
            echo "Sao Paulo" ;
            break;
        case 19:
            echo "Campinas";
            break;
        case 21:
            echo "Rio de Janeiro";
            break;
        case 27:
            echo "Vitoria";
            break;
        case 31:
            echo "Belo Horizonte";
            break;
        case 32:
            echo "Juiz de Fora";
            break;
        case 61:
            echo "Brasilia";
            break;
        case 71:
            echo "Salvador" ;
            break;
        default:
            echo"DDD nao cadastrado";
            break;
    }
?>
