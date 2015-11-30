package Enteties;

import Enteties.Bruker;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-11-30T11:27:18")
@StaticMetamodel(Kalender.class)
public class Kalender_ { 

    public static volatile SingularAttribute<Kalender, Long> KalenderId;
    public static volatile SingularAttribute<Kalender, Boolean> Godkjent_IkkeGodkjent;
    public static volatile SingularAttribute<Kalender, String> ModulFrist;
    public static volatile SingularAttribute<Kalender, Bruker> bruker;
    public static volatile SingularAttribute<Kalender, String> Soke_Motetid;

}