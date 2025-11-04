package br.fiap.assistencia_tecnica.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity @Data
@Table(name="JAVA_EQUIPAMENTO")
public class Equipamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EQUIP")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", nullable = false, foreignKey = @ForeignKey(name = "FK_EQUIP_CLIENTE"))
    private Cliente cliente;
    @Column(name = "TIPO", nullable = false, length = 50)
    private String tipo;
    @Column(name = "MARCA", length = 50)
    private String marca;
    @Column(name = "MODELO", length = 50)
    private String modelo;
    @Column(name = "NUMERO_SERIE",length = 50)
    private String numeroSerie;
    @Column(name = "DATA_CADASTRO")
    private LocalDate dataCadastro;


}
