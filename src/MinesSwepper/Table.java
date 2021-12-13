package MinesSwepper;

import MinesSwepper.Fields.Cell;
import MinesSwepper.Fields.Mine;
import MinesSwepper.Fields.Pointer;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Table {
    private int row;
    private int col;
    private String[][] table;
    private Cell[][] cellTable;
    private int mineCount;
    private int emptyCount;
    private int pointerCount;
    private Random random;
    Scanner scanner;

    public Table(int row, int col) {
        this.row = row;
        this.col = col;
        this.table = new String[row][col];
        this.cellTable = new Cell[row][col];
        this.mineCount = (row*col)/4;
        this.emptyCount=(row*col)/4;
        this.pointerCount=(row*col)/2;
        this.random = new Random();
        this.scanner = new Scanner(System.in);
    }


    public void run(){
        int row;
        int col;
        int process;
        Cell cell;
        initialize();
        while (true){
            showTable();
            System.out.print("\n row:");
            row = scanner.nextInt()-1;
            System.out.print("\n col:");
            col = scanner.nextInt()-1;
            cell = cellTable[row][col];
            System.out.println("Chose one\n" +
                    "1)Open cell\n" +
                    "2)Set flag\n" +
                    "3)Unset flag\n");
            process = scanner.nextInt();
            switch (process){
                case 1:
                    if(cell.getClass()==Mine.class){
                        System.out.println("Patladi");
                        setTrueAllVisibility();
                        showTable();
                        return;
                    }

                    if(cell.getClass()==Pointer.class){
                        if(cell.getClass()==Pointer.class){
                            if(getMineCount(cell)==0){
                                cell.setMinesAround(0);
                                ArrayList<Cell> list = new ArrayList<Cell>();
                                list.add(cell);
                                brighten(list,0);
                            }
                            if(!cell.isVisibility()){
                                cell.setVisibility(true);
                            }
                        }
                    }
                    break;
                case 2:
                    if(!cell.isVisibility()){
                        cell.setFlagged(true);
                    }
                    break;
                case 3:
                    if(!cell.isVisibility()){
                        cell.setFlagged(false);
                    }
                    break;
                default:
                    continue;


            }

        }
    }

    private void brighten(ArrayList<Cell> arr, int order) {
        if(order>arr.size()){
            return;
        }
        for (int v = 0; v < order+1; v++) {
            for (int i = -1; i < 2; i++) {
                for (int j = -1; j <2 ; j++) {
                    try{
                        if(cellTable[arr.get(v).getRow()+i][arr.get(v).getCol()+j].getClass()!=Mine.class){
                            if(!cellTable[arr.get(v).getRow()+i][arr.get(v).getCol()+j].isVisibility()){
                                int emptyFieldCount = getEmptyFieldCount(arr.get(v));
                                if(emptyFieldCount>0){
                                    arr.add(cellTable[arr.get(v).getRow()+i][arr.get(v).getCol()+j]);
                                    cellTable[arr.get(v).getRow()+i][arr.get(v).getCol()+j].setVisibility(true);
                                }

                            }
                        }
                    }catch (IndexOutOfBoundsException e){

                    }
                }
            }
        }
        brighten(arr,order+1);
    }

    private int getEmptyFieldCount(Cell cell) {
        int emptyFields = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j <2 ; j++) {
                try{
                    if(cellTable[cell.getRow()+i][cell.getCol()+j].getClass()==Pointer.class){
                        if(cell.getSymbol().compareTo(" _ ")==0){
                            emptyFields++;
                        }
                    }
                }catch (IndexOutOfBoundsException e){

                }
            }
        }
        return emptyFields;
    }

    public void initialize(){
        depositPointer();
        depositMine();
        calculateMineCount();
        depositEmpty();

    }
    private void calculateMineCount(){
        for (Cell[] cells : cellTable) {
            for (Cell cell:cells) {
                try{
                    if(cell.getClass()==Pointer.class){
                        ((Pointer) cell).setMinesAround(getMineCount(cell));
                    }
                }catch (NullPointerException e){

                }
            }
        }
    }
    private int getMineCount(Cell cell){
        int mineCount = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j <2 ; j++) {
                try{
                    try {
                        if(cellTable[cell.getRow()+i][cell.getCol()+j].getClass()==Mine.class){
                            mineCount++;
                        }
                    }catch (NullPointerException e){
                        continue;
                    }
                }catch (IndexOutOfBoundsException e){

                }
            }
        }
        return mineCount;
    }
    private void setTrueAllVisibility(){
        for(Cell[] row:cellTable){
            for(Cell col:row){
                if(!col.isVisibility()){
                    col.setVisibility(true);
                }
            }
        }
    }

    private void depositMine(){
        System.out.println("mc:"+mineCount);
        for (int i = 0; i < mineCount; i++) {
            int row = random.nextInt(this.row);
            int col = random.nextInt(this.col);
            if(getCellInfo(row,col)==null){
                Cell mine = new Mine(row,col);
                cellTable[row][col]=mine;
            }else{
                i--;
            }
        }
    }
    private void depositPointer(){
        System.out.println("pc:"+pointerCount);
        for (int i = 0; i < pointerCount; i++) {
            int row = random.nextInt(this.row);
            int col = random.nextInt(this.col);
            if(getCellInfo(row,col)==null){
                Cell pointer = new Pointer(row,col);
                cellTable[row][col]=pointer;
            }else{
                i--;
            }
        }
    }
    private void depositEmpty(){
        System.out.println("ec:"+emptyCount);
        for (int i = 0; i < emptyCount; i++) {
            int row = random.nextInt(this.row);
            int col = random.nextInt(this.col);
            if(getCellInfo(row,col)==null){
                Cell pointer = new Pointer(row,col);
                pointer.setMinesAround(0);
                cellTable[row][col]=pointer;
            }else{
                i--;
            }
        }
    }
    private Cell getCellInfo(int row, int col){
        try{
            return cellTable[row][col];
        }catch (IndexOutOfBoundsException e){

        }
        return null;
    }

    public void showTable(){
        for(Cell[] row:cellTable){
            for(Cell col:row){
                System.out.print(col.getSymbol());
            }
            System.out.println();
        }
    }
}
