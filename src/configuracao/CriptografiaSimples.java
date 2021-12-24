package configuracao;

public class CriptografiaSimples {
    private static char[] alfabetoString = 
        {'z','x','c','v','b','n','m',',','.',';',
        '<','>',':','/','?','�','|','|','a','s',
        'd','f','g','h','j','k','l','�','^','~',
        'q','w','e','r','t','y','u','i','o','p',
        '`','�','{','[','�','}',']','�','1','2',
        '3','4','5','6','7','8','9','0','!','@',
        '#','$','%','&','*','(',')','-','_','+',
        '-','=','�','A','�','�','�','�','�','�',
        '�','�','U','�','�','�','�','E','�','�',
        '�','�','�','�','O','�','�','�','�','�',
        '�','�','�','I','�','�','�','�','�','�',
        'Q','W','R','T','Y','P','S','D','F','G',
        'H','J','K','L','�','Z','X','C','V','B',
        'N','M',',','\n', ' '};;
    private static String[] criptografiaString = 
        {"s4dbf","asd50","jhkv1","sdf5f","uy7sd",
        "897sd","sdvck","asg8b","fgbgd","654fs",
        "rf4vb","kjlb3","jkljk","vdgd7","098sd",
        "iojhn","bvn43","lhkg5","8907v","978vc",
        "mvb32","gzf23","23a45","bdfas","234fd",
        "opiu1","hjg45","cuyfa","sd87a","54nas",
        "jkjh4","vjkgh","xcbcv","lkasd","vddsd",
        "fghgf","kjher","dadfa","aiuok","ghkjh",
        "asdfd","234as","dsakh","mgfgd","ilzxy",
        "afbgh","asldj","cgvba","jhdfa","aa123",
        "654ad","cvbn8","df65g","98ds7","cas78",
        "9s8d7","d65as","asd44","a98s7","as89s",
        "gh654","mn654","fg98h","321fd","987df",
        "98s7d","s69df","sd78f","978ds","78s78",
        "87asd","987hg","bfg46","89d7f","634aa",
        "987hg","iuf78","456df","897sd","987da",
        "654zg","546ds","asd45","9d87f","654sd",
        "ds65e","cleii","937df","987fa","6aaad",
        "6asda","686aa","987as","798sv","xcx45",
        "897as","98df7","12fd7","gh54a","bn987",
        "8a7sd","asd6s","6dfaa","524sd","gf5h4",
        "98gd7","564as","98v7s","789ds","asd54",
        "gf6h5","65d4a","65sdf","56a1s","987da",
        "654ds","987sd","98s7v","9s8df","98sd7",
        "6sssd","sdf45","sd8gh","as9d8","998c7",
        "sdgsf","sdfas","vsdf3","4534a","sdfq2",
        "dffga","9323s","dsre3","324xx", "wes69"};
    
    public static String criptogafar(String mensagem){
        
        String dadoCriptografado = "";
        int index;
        for(int c = 0; c < mensagem.length(); c++){
            index = indexOf(mensagem.charAt(c));
            dadoCriptografado += criptografiaString[index];
        }
        return dadoCriptografado;        
    }
    
    public static String descriptografar(String mensagem){
        String dadoDescriptografado = "";
        int index, soumeM = 0, soumeMax = 5, voltas = mensagem.length()/5;

        for(int c = 0; c < voltas; c++){
            index = indexOf(mensagem.substring(soumeM, soumeMax));
            dadoDescriptografado += alfabetoString[index];
            soumeM += 5;
            soumeMax += 5;
        }
        return dadoDescriptografado;
    }
    
    private static int indexOf(char value) {
    	for(int c = 0; c < alfabetoString.length; c++) {
    		if(alfabetoString[c] == value) {
    			return c;
    		}
    	}
    	
    	return -1;
    }
    
    private static int indexOf(String value) {
    	for(int c = 0; c < criptografiaString.length; c++) {
    		if(criptografiaString[c].equals(value)) {
    			return c;
    		}
    	}
    	
    	return -1;
    }
       
}