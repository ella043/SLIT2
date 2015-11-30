package Enteties;

import Enteties.Bruker;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-30T11:27:18")
@StaticMetamodel(Tilbakemelding.class)
public class Tilbakemelding_ { 

    public static volatile SingularAttribute<Tilbakemelding, String> Kommentar;
    public static volatile SingularAttribute<Tilbakemelding, Long> TilbakemeldingId;
    public static volatile SingularAttribute<Tilbakemelding, String> ModulTilbakemelding;
    public static volatile SingularAttribute<Tilbakemelding, Boolean> Godkjenning;
    public static volatile SingularAttribute<Tilbakemelding, Bruker> bruker;
    public static volatile SingularAttribute<Tilbakemelding, String> SvarPaaSpm;

}