package br.fiap.assistencia_tecnica.domain;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="JAVA_EQUIPAMENTO")
public class Equipamento {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "ID_EQUIP")
    private Long id;
    @Column(name = "TIPO", nullable = false, length = 50)
    private String tipo;
    @Column(name = "MARCA", length = 50)
    private String marca;
    @Column(name = "MODELO ",length = 50)
    private String Modelo;
    @Column(name = "NUMERO_SERIE",length = 50)
    private String numeroSerie;
    @Column(name = "DATA_CADASTRO")
    private LocalDate dataCadastro;

    @JoinColumn(name = "ID_CLIENTE",nullable = false, foreignKey = @ForeignKey(name="FK_EQUIP_CLIENTE"))
    private Cliente cliente;
}
