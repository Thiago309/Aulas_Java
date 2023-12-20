package Interface;

public class triAtleta implements ciclista, nadador, corredor{
	
	@Override
	public String aquecer() {
		
		return "Esta aquecendo";
	}
	
	@Override
	public String correr() {
		
		return "Esta correndo";
	}
		
	
	@Override
	public String nadar() {
		
		return "Esta nadando";
	}
	
	@Override
	public String pedalar() {
		
		return "Esta pedalando";
		}
}