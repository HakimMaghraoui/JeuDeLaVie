
public class Jeu {
	public static void main(String [] args){
		Liste l = new Liste();
		Coordoner p1= new Coordoner(4,-3);
		Coordoner p2= new Coordoner(6,-5);
		Coordoner p3= new Coordoner(0,0);
		Coordoner p4= new Coordoner(0,3);
		Coordoner p5= new Coordoner(6,2);
		Maillon m1= new Maillon (p1);
        Maillon m2= new Maillon (p2);
        Maillon m3= new Maillon (p3);
        Maillon m4= new Maillon (p4);
        Maillon m5= new Maillon (p5);
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		l.add(p5);

		System.out.println("Ci aodzx 95s2");
		Coordoner start= new Coordoner(-5,6);
		afficher(l,start);
	}
	
	public static void afficher(Liste liste, Coordoner p){
		boolean b = true;
		boolean f = true;
		Maillon tmp= liste.getFirst();
		Maillon mp= new Maillon(p);
		Maillon m=null;
		while(tmp.getSuivant()!=null && f){
			if(tmp.compareTo(mp)<=0){
				m=tmp;
				f=false;
			}else{
				tmp.getSuivant();
			}
		}
		for(int i=p.getY(); i<p.getY()-10; i++){
			for(int j=p.getX(); j<p.getX()+10; j++){
				Maillon z = new Maillon(new Coordoner(j,i));
				if(m==null){
					System.out.print(".");
				}else{
					if(z.compareTo(m)>0){
						System.out.print(".");
					}else{
						if(z.compareTo(m)==0){
							System.out.print("*");
							m=m.getSuivant();
						}
					}
				}
			}
			System.out.println();
		}
	}
}