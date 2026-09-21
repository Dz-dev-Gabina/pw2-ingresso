CREATE DATABASE pw2_ingressos;

USE pw2_ingressos;

CREATE TABLE TBL_FILME (
    ID_FILME BIGINT PRIMARY KEY IDENTITY,
    TX_NOME VARCHAR(50) NOT NULL,
    NR_DURACAO INT NOT NULL,
    TP_CATEGORIA VARCHAR(17) NOT NULL,
    TP_CLASSIFICACAO VARCHAR(5),
    CHK_EM_CARTAZ VARCHAR(1),
    NR_ANO INT,
    TX_CAPA VARCHAR(300),
    TX_DIRETOR VARCHAR(300),
    TX_ELENCO VARCHAR(300),
    TX_DESCRICAO VARCHAR(500),
    NR_AVALIACAO FLOAT
);

INSERT INTO TBL_FILME
(TX_NOME, NR_DURACAO, TP_CATEGORIA, TP_CLASSIFICACAO, CHK_EM_CARTAZ, NR_ANO, TX_CAPA, TX_DIRETOR, TX_ELENCO, TX_DESCRICAO, NR_AVALIACAO)
VALUES
('Mad Max: Estrada da Fúria', 120, 'ACAO', 'A16', 'S', 2015, 'madmax.jpg', 'George Miller', 'Tom Hardy, Charlize Theron', 'Em um mundo pós-apocalíptico, uma fuga cheia de ação.', 8.6),

('Clube da Luta', 139, 'DRAMA', 'A18', 'N', 1999, 'clubedaluta.jpg', 'David Fincher', 'Brad Pitt, Edward Norton', 'Um homem cria um clube secreto com regras violentas.', 9.0),

('Homem-Aranha: Sem Volta Para Casa', 148, 'ACAO', 'A12', 'S', 2021, 'spiderman.jpg', 'Jon Watts', 'Tom Holland, Zendaya', 'Peter Parker enfrenta consequências de ter sua identidade revelada.', 8.7),

('O Iluminado', 146, 'TERROR', 'A16', 'N', 1980, 'iluminado.jpg', 'Stanley Kubrick', 'Jack Nicholson, Shelley Duvall', 'Um homem enlouquece isolado em um hotel.', 8.9),

('Divertida Mente', 95, 'ANIMACAO', 'LIVRE', 'S', 2015, 'divertidamente.jpg', 'Pete Docter', 'Amy Poehler, Bill Hader', 'As emoções de uma garota ganham vida dentro de sua mente.', 8.5);