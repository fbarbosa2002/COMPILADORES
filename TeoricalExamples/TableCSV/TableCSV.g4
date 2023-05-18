// Grammar to create table in CSV FORMAT
// First line is the name of the columns 
// Next lines are the values of each collumn respectly
grammar TableCSV;

// Header aparecem antes da classe , neste caso, parser , ou seja, fora desta
@parser::header{ 
    import static java.lang.System.*;
}

// Members aparecem dentro da classe , neste caso, parser
@parser::members{
    private List<String> names = new ArrayList<>();
}


file : line[true] line[false]* EOF;

// line fica com um parametro boolean "CheckFL" e com uma variavel local inteira "col"

line[boolean CheckFL] locals [int col = 0]
@after{
    if (!$CheckFL){
        out.println();
    }
}:
    field[ $CheckFL , $col] {$col++;}(',' field[$CheckFL , $col] {$col++;})* '\r'? '\n';

// field fica com um parametro boolean "FirstLine" e outro inteiro "column"
// e ainda com uma variavel local String "val"

field[boolean FirstLine , int column] locals [String val = ""]
    @after{
        if ($FirstLine){
            if ($val.isEmpty()){
                err.println("Error: column names empty");
            }
            else{
                names.add($val);
            }
        }
        else{
            if($column >= names.size())
            {
                err.println("ERROR: More columns added");
            }
            else{
                out.print("\t"+names.get($column)+ " : " + $val);
            }
        }
    }
    : 
        (STRING {$val = $STRING.text.trim() ; } | TEXT {$val = $TEXT.text.trim() ; }| );

STRING: [ \t]* '"' .*? '"' [ \t]*;

TEXT: ~[,"\r\n] ~[,\r\n]*;