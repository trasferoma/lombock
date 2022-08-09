package it.studio_java8.lombok.esempi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TFC1003_CONCORSO")
@NamedQuery(name = "Tfc1003Concorso.findAll", query = "SELECT t FROM Tfc1003Concorso t")
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@lombok.Builder
@lombok.ToString
@lombok.EqualsAndHashCode(callSuper = false, onlyExplicitlyIncluded = true)
public class Tfc1003Concorso extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRG_CNC")
    @lombok.EqualsAndHashCode.Include
    private Long id;

    @Temporal(TemporalType.DATE)
    @Column(name = "DAT_CRE_CNC", nullable = false)
    @lombok.ToString.Exclude
    private Calendar dataCreazione;

    @Temporal(TemporalType.DATE)
    @Column(name = "DAT_DEC_CNC", nullable = true)
    @lombok.ToString.Exclude
    private Calendar dataDecreto;

    @Temporal(TemporalType.DATE)
    @Column(name = "DAT_FIN_PRE_DMD", nullable = true)
    @lombok.ToString.Exclude
    private Calendar dataFinePresentazioneDomande;

    @Temporal(TemporalType.DATE)
    @Column(name = "DAT_INI_PRE_DMD", nullable = true)
    @lombok.ToString.Exclude
    private Calendar dataInizioPresentazioneDomande;

    @Column(name = "DES_TIT_CNC", nullable = false)
    private String titolo;

    @Column(name = "DES_CNC", nullable = false)
    private String descrizione;

    @Column(name = "IMP_DIR_SGT", nullable = true)
    private BigDecimal importoDirittiSegreteria;

    @Column(name = "NUM_DEC_CNC", nullable = false, length = 10)
    private String numeroDecretoBando;

    @OneToMany(mappedBy = "tfc1003Concorso", cascade = CascadeType.PERSIST)
    @lombok.Singular(value = "addDecreto")
    private List<Tfc1018Decreto> elencoDecreti = new ArrayList<>();
}
