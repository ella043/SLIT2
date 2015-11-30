package Enteties;

import Enteties.Bruker;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-30T11:27:18")
@StaticMetamodel(Innlevering.class)
public class Innlevering_ { 

    public static volatile SingularAttribute<Innlevering, String> Kommentar;
    public static volatile SingularAttribute<Innlevering, String> LastOpp;
    public static volatile SingularAttribute<Innlevering, Long> InnleveringId;
    public static volatile SingularAttribute<Innlevering, Bruker> bruker;
    public static volatile SingularAttribute<Innlevering, String> Vedlegg;

}