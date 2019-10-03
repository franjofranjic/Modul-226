package ch.gbssg.edu.franjic.franjo.Uebung1;

import java.util.ArrayList;

public class Manschaft {
	
	ArrayList<Object> manschaft = new ArrayList<Object>();
	
	public void setFeldspieler(Feldspieler player) {
		this.manschaft.add(player);
	}
	
	public void setTrainer(Trainer trainer) {
		this.manschaft.add(trainer);
	}
	
	public void setGoalie(Goalie goalie) {
		this.manschaft.add(goalie);
	}
	
	public void setSportchef(Sportchef sportchef) {
		this.manschaft.add(sportchef);
	}
	
	public void setErsatzbank(Ersatzbank ersatzbank) {
		this.manschaft.add(ersatzbank);
	}
	
	public String getPlayer() {
		String list = "";
		for(Object tmpplayer:manschaft) {
			if (tmpplayer.getClass() == Feldspieler.class) {
				list += ((Feldspieler) tmpplayer).getName() + "\n";
			}
			
			if (tmpplayer.getClass() == Trainer.class) {
				list += ((Trainer) tmpplayer).getName() + "\n";
			}
			
			if (tmpplayer.getClass() == Goalie.class) {
				list += ((Goalie) tmpplayer).getName() + "\n";
			}
			
			if (tmpplayer.getClass() == Sportchef.class) {
				list += ((Sportchef) tmpplayer).getName() + "\n";
			}
			
			if (tmpplayer.getClass() == Ersatzbank.class) {
				list += ((Ersatzbank) tmpplayer).getName() + "\n";
			}
					
			
		}
		return list;
	}

}
