package br.com.etec.ingresso.entity;

import br.com.etec.ingresso.enuns.CategoriaFilmeEnum;
import br.com.etec.ingresso.enuns.ClassificacaoIndicativaEnum;
import br.com.etec.ingresso.enuns.SimNaoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="TBL_FILME")

public class Filme {
    @Id //pk
    @Column(name = "ID_FILME")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TX_NOME")
    private String nome;

    @Column(name = "NR_DURACAO")
    private Integer duracao;

    @Column(name = "TP_CATEGORIA")
    @Enumerated(EnumType.STRING)
    private CategoriaFilmeEnum categoria;

    @Column(name = "TP_CLASSIFICACAO")
    @Enumerated(EnumType.STRING)
    private ClassificacaoIndicativaEnum classificacao;

    @Column(name = "NR_ANO")
    private Integer ano;

    @Column(name = "TX_CAPA")
    private String capa;

    @Column(name = "TX_DIRETOR")
    private String diretor;

    @Column(name = "TX_ELENCO")
    private String elenco;

    @Column(name = "TX_DESCRICAO")
    private String descricao;

    @Column(name = "NR_AVALIACAO")
    private Double avaliacao;

    @Column(name = "CHK_EM_CARTAZ")
    @Enumerated(EnumType.STRING)
    private SimNaoEnum emCartaz;

    @Transient
    private LocalDateTime dataExclusao;
}
