package com.example.taulaperiodica;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_list_view);

        final ArrayList<cElement> taulaPeriodicaCompleta = new ArrayList<>();
        final ArrayList<cElement> taulaPeriodica = taulaPeriodicaCompleta;

        taulaPeriodicaCompleta.add(new cElement("1","H","Hydrogen","1.00794","1","2.2","37","None","120","1312","-73","-1, 1","gas","diatomic","14","20","0.0000899","nonmetal","1766") );
        taulaPeriodicaCompleta.add(new cElement("2","He","Helium","4.002602","2","None","32","None","140","2372","0","None","gas","atomic","None","4","0","noble gas","1868") );
        taulaPeriodicaCompleta.add(new cElement("3","Li","Lithium","6.941","[He] 2s1","0.98","134","76","182","520","-60","1","solid","metallic","454","1615","0.54","alkali metal","1817") );
        taulaPeriodicaCompleta.add(new cElement("4","Be","Beryllium","9.012182","[He] 2s2","1.57","90","45","None","900","0","2","solid","metallic","1560","2743","1.85","alkaline earth metal","1798") );
        taulaPeriodicaCompleta.add(new cElement("5","B","Boron","10.811","[He] 2s2 2p1","2.04","82","27","None","801","-27","1, 2, 3","solid","covalent network","2348","4273","2.46","metalloid","1807") );
        taulaPeriodicaCompleta.add(new cElement("6","C","Carbon","12.0107","[He] 2s2 2p2","2.55","77","16","170","1087","-154","-4, -3, -2, 1, 2, 3, 4","solid","covalent network","3823","4300","2.26","nonmetal","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("7","N","Nitrogen","14.0067","[He] 2s2 2p3","3.04","75","146","155","1402","-7","-3, -2, 1, 2,3, 4, 5","gas","diatomic","63","77","0","nonmetal","1772") );
        taulaPeriodicaCompleta.add(new cElement("8","O","Oxygen","15.9994","[He] 2s2 2p4","3.44","73","140","152","1314","-141","-2, 1, 2","gas","diatomic","55","90","0","nonmetal","1774") );
        taulaPeriodicaCompleta.add(new cElement("9","F","Fluorine","18.9984032","[He] 2s2 2p5","3.98","71","133","147","1681","-328","-1","gas","atomic","54","85","0","halogen","1670") );
        taulaPeriodicaCompleta.add(new cElement("10","Ne","Neon","20.1797","[He] 2s2 2p6","None","69","None","154","2081","0","None","gas","atomic","25","27","0","noble gas","1898") );
        taulaPeriodicaCompleta.add(new cElement("11","Na","Sodium","22.98976928","[Ne] 3s1","0.93","154","102","227","496","-53","-1, 1","solid","metallic","371","1156","0.97","alkali metal","1807") );
        taulaPeriodicaCompleta.add(new cElement("12","Mg","Magnesium","24.305","[Ne] 3s2","1.31","130","72","173","738","0","1, 2","solid","metallic","923","1363","1.74","alkaline earth metal","1808") );
        taulaPeriodicaCompleta.add(new cElement("13","Al","Aluminum or Aluminium","26.9815386","[Ne] 3s2 3p1","1.61","118","53.5","None","578","-43","1, 3","solid","metallic","933","2792","2.7","metal","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("14","Si","Silicon","28.0855","[Ne] 3s2 3p2","1.9","111","40","210","787","-134","-4, -3, -2, 1, 2, 3, 4","solid","metallic","1687","3173","2.33","metalloid","1854") );
        taulaPeriodicaCompleta.add(new cElement("15","P","Phosphorus","30.973762","[Ne] 3s2 3p3","2.19","106","44","180","1012","-72","-3, -2, 1, 2, 3, 4, 5","solid","covalent network","317","554","1.82","nonmetal","1669") );
        taulaPeriodicaCompleta.add(new cElement("16","S","Sulfur","32.065","[Ne] 3s2 3p4","2.58","102","184","180","1000","-200","-2, 1, 2, 3, 4, 5, 6","solid","covalent network","388","718","1.96","nonmetal","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("17","Cl","Chlorine","35.453","[Ne] 3s2 3p5","3.16","99","181","175","1251","-349","-1, 1, 2, 3, 4, 5, 6, 7","gas","covalent network","172","239","0","halogen","1774") );
        taulaPeriodicaCompleta.add(new cElement("18","Ar","Argon","39.948","[Ne] 3s2 3p6","None","97","None","188","1521","0","None","gas","atomic","84","87","0","noble gas","1894") );
        taulaPeriodicaCompleta.add(new cElement("19","K","Potassium","39.0983","[Ar] 4s1","0.82","196","138","275","419","-48","1","solid","metallic","337","1032","0.86","alkali metal","1807") );
        taulaPeriodicaCompleta.add(new cElement("20","Ca","Calcium","40.078","[Ar] 4s2","1","174","100","None","590","-2","2","solid","metallic","1115","1757","1.55","alkaline earth metal","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("21","Sc","Scandium","44.955912","[Ar] 3d1 4s2","1.36","144","74.5","None","633","-18","1, 2, 3","solid","metallic","1814","3103","2.99","transition metal","1876") );
        taulaPeriodicaCompleta.add(new cElement("22","Ti","Titanium","47.867","[Ar] 3d2 4s2","1.54","136","86","None","659","-8","-1, 2, 3, 4","solid","metallic","1941","3560","4.51","transition metal","1791") );
        taulaPeriodicaCompleta.add(new cElement("23","V","Vanadium","50.9415","[Ar] 3d3 4s2","1.63","125","79","None","651","-51","-1, 2, 3, 4","solid","metallic","2183","3680","6.11","transition metal","1803") );
        taulaPeriodicaCompleta.add(new cElement("24","Cr","Chromium","51.9961","[Ar] 3d5 4s1","1.66","127","80","None","653","-64","-2, 1, 2, 3, 4, 5, 6","solid","metallic","2180","2944","7.14","transition metal","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("25","Mn","Manganese","54.938045","[Ar] 3d5 4s2","1.55","139","67","None","717","0","-3, -2, 1, 2, 3, 4, 5, 6, 7","solid","metallic","1519","2334","7.47","transition metal","1774") );
        taulaPeriodicaCompleta.add(new cElement("26","Fe","Iron","55.845","[Ar] 3d6 4s2","1.83","125","78","None","763","-16","-2, 1, 2, 3, 4, 5, 6","solid","metallic","1811","3134","7.87","transition metal","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("27","Co","Cobalt","58.933195","[Ar] 3d7 4s2","1.88","126","74.5","None","760","-64","-1, 1, 2, 3, 4, 5","solid","metallic","1768","3200","8.9","transition metal","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("28","Ni","Nickel","58.6934","[Ar] 3d8 4s2","1.91","121","69","163","737","-112","-1, 1, 2, 3, 4","solid","metallic","1728","3186","8.91","transition metal","1751") );
        taulaPeriodicaCompleta.add(new cElement("29","Cu","Copper","63.546","[Ar] 3d10 4s1","1.9","138","77","140","746","-118","1, 2, 3, 4","solid","metallic","1358","3200","8.92","transition metal","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("30","Zn","Zinc","65.38","[Ar] 3d10 4s2","1.65","131","74","139","906","0","2","solid","metallic","693","1180","7.14","transition metal","1746") );
        taulaPeriodicaCompleta.add(new cElement("31","Ga","Gallium","69.723","[Ar] 3d10 4s2 4p1","1.81","126","62","187","579","-29","1, 2, 3","solid","metallic","303","2477","5.9","metal","1875") );
        taulaPeriodicaCompleta.add(new cElement("32","Ge","Germanium","72.64","[Ar] 3d10 4s2 4p2","2.01","122","73","None","762","-119","-4, 1, 2, 3, 4","solid","metallic","1211","3093","5.32","metalloid","1886") );
        taulaPeriodicaCompleta.add(new cElement("33","As","Arsenic","74.9216","[Ar] 3d10 4s2 4p3","2.18","119","58","185","947","-78","-3, 2, 3, 4, 5","solid","metallic","1090","887","5.73","metalloid","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("34","Se","Selenium","78.96","[Ar] 3d10 4s2 4p4","2.55","116","198","190","941","-195","-2, 2, 4, 6","solid","metallic","494","958","4.82","nonmetal","1817") );
        taulaPeriodicaCompleta.add(new cElement("35","Br","Bromine","79.904","[Ar] 3d10 4s2 4p5","2.96","114","196","185","1140","-325","-1, 1, 3, 4, 5, 7","liquid","covalent network","266","332","3.12","halogen","1826") );
        taulaPeriodicaCompleta.add(new cElement("36","Kr","Krypton","83.798","[Ar] 3d10 4s2 4p6","None","110","None","202","1351","0","2","gas","atomic","116","120","0","noble gas","1898") );
        taulaPeriodicaCompleta.add(new cElement("37","Rb","Rubidium","85.4678","[Kr] 5s1","0.82","211","152","None","403","-47","1","solid","metallic","312","961","1.53","alkali metal","1861") );
        taulaPeriodicaCompleta.add(new cElement("38","Sr","Strontium","87.62","[Kr] 5s2","0.95","192","118","None","550","-5","2","solid","metallic","1050","1655","2.63","alkaline earth metal","1790") );
        taulaPeriodicaCompleta.add(new cElement("39","Y","Yttrium","88.90585","[Kr] 4d1 5s2","1.22","162","90","None","600","-30","1, 2, 3","solid","metallic","1799","3618","4.47","transition metal","1794") );
        taulaPeriodicaCompleta.add(new cElement("40","Zr","Zirconium","91.224","[Kr] 4d2 5s2","1.33","148","72","None","640","-41","1, 2, 3, 4","solid","metallic","2128","4682","6.51","transition metal","1789") );
        taulaPeriodicaCompleta.add(new cElement("41","Nb","Niobium","92.90638","[Kr] 4d4 5s1","1.6","137","72","None","652","-86","-1, 2, 3, 4, 5","solid","metallic","2750","5017","8.57","transition metal","1801") );
        taulaPeriodicaCompleta.add(new cElement("42","Mo","Molybdenum","95.96","[Kr] 4d5 5s1","2.16","145","69","None","684","-72","-2, 1, 2, 3, 4, 5, 6","solid","metallic","2896","4912","10.28","transition metal","1778") );
        taulaPeriodicaCompleta.add(new cElement("43","Tc","Technetium","98","[Kr] 4d5 5s2","1.9","156","64.5","None","702","-53","-3, 1, 2, 3, 4, 5, 6, 7","solid","metallic","2430","4538","11.5","transition metal","1937") );
        taulaPeriodicaCompleta.add(new cElement("44","Ru","Ruthenium","101.07","[Kr] 4d7 5s1","2.2","126","68","None","710","-101","-2, 1, 2, 3, 4, 5, 6, 7, 8","solid","metallic","2607","4423","12.37","transition metal","1827") );
        taulaPeriodicaCompleta.add(new cElement("45","Rh","Rhodium","102.9055","[Kr] 4d8 5s1","2.28","135","66.5","None","720","-110","-1, 1, 2, 3, 4, 5, 6","solid","metallic","2237","3968","12.45","transition metal","1803") );
        taulaPeriodicaCompleta.add(new cElement("46","Pd","Palladium","106.42","[Kr] 4d10","2.2","131","59","163","804","-54","2, 4","solid","metallic","1828","3236","12.02","transition metal","1803") );
        taulaPeriodicaCompleta.add(new cElement("47","Ag","Silver","107.8682","[Kr] 4d10 5s1","1.93","153","115","172","731","-126","1, 2, 3","solid","metallic","1235","2435","10.49","transition metal","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("48","Cd","Cadmium","112.411","[Kr] 4d10 5s2","1.69","148","95","158","868","0","2","solid","metallic","594","1040","8.65","transition metal","1817") );
        taulaPeriodicaCompleta.add(new cElement("49","In","Indium","114.818","[Kr] 4d10 5s2 5p1","1.78","144","80","193","558","-29","1, 2, 3","solid","metallic","430","2345","7.31","metal","1863") );
        taulaPeriodicaCompleta.add(new cElement("50","Sn","Tin","118.71","[Kr] 4d10 5s2 5p2","1.96","141","112","217","709","-107","-4, 2, 4","solid","metallic","505","2875","7.31","metal","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("51","Sb","Antimony","121.76","[Kr] 4d10 5s2 5p3","2.05","138","76","None","834","-103","-3, 3, 5","solid","metallic","904","1860","6.7","metalloid","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("52","Te","Tellurium","127.6","[Kr] 4d10 5s2 5p4","2.1","135","221","206","869","-190","-2, 2, 4, 5, 6","solid","metallic","723","1261","6.24","metalloid","1782") );
        taulaPeriodicaCompleta.add(new cElement("53","I","Iodine","126.90447","[Kr] 4d10 5s2 5p5","2.66","133","220","198","1008","-295","-1, 1, 3, 5, 7","solid","covalent network","387","457","4.94","halogen","1811") );
        taulaPeriodicaCompleta.add(new cElement("54","Xe","Xenon","131.293","[Kr] 4d10 5s2 5p6","None","130","48","216","1170","0","2, 4, 6, 8","gas","atomic","161","165","0.01","noble gas","1898") );
        taulaPeriodicaCompleta.add(new cElement("55","Cs","Cesium","132.9054519","[Xe] 6s1","0.79","225","167","None","376","-46","1","solid","metallic","302","944","1.88","alkali metal","1860") );
        taulaPeriodicaCompleta.add(new cElement("56","Ba","Barium","137.327","[Xe] 6s2","0.89","198","135","None","503","-14","2","solid","metallic","1000","2143","3.51","alkaline earth metal","1808") );
        taulaPeriodicaCompleta.add(new cElement("57","La","Lanthanum","138.90547","[Xe] 5d1 6s2","1.1","169","103.2","None","538","-48","2, 3","solid","metallic","1193","3737","6.15","lanthanoid","1839") );
        taulaPeriodicaCompleta.add(new cElement("58","Ce","Cerium","140.116","[Xe] 4f1 5d1 6s2","1.12","None","102","None","534","-50","2, 3, 4","solid","metallic","1071","3633","6.69","lanthanoid","1803") );
        taulaPeriodicaCompleta.add(new cElement("59","Pr","Praseodymium","140.90765","[Xe] 4f3 6s2","1.13","None","99","None","527","-50","2, 3, 4","solid","metallic","1204","3563","6.64","lanthanoid","1885") );
        taulaPeriodicaCompleta.add(new cElement("60","Nd","Neodymium","144.242","[Xe] 4f4 6s2","1.14","None","129","None","533","-50","2, 3","solid","metallic","1294","3373","7.01","lanthanoid","1885") );
        taulaPeriodicaCompleta.add(new cElement("61","Pm","Promethium","145","[Xe] 4f5 6s2","1.13","None","97","None","540","-50","3","solid","metallic","1373","3273","7.26","lanthanoid","1947") );
        taulaPeriodicaCompleta.add(new cElement("62","Sm","Samarium","150.36","[Xe] 4f6 6s2","1.17","None","122","None","545","-50","2, 3","solid","metallic","1345","2076","7.35","lanthanoid","1853") );
        taulaPeriodicaCompleta.add(new cElement("63","Eu","Europium","151.964","[Xe] 4f7 6s2","1.2","None","117","None","547","-50","2, 3","solid","metallic","1095","1800","5.24","lanthanoid","1901") );
        taulaPeriodicaCompleta.add(new cElement("64","Gd","Gadolinium","157.25","[Xe] 4f7 5d1 6s2","1.2","None","93.8","None","593","-50","1, 2, 3","solid","metallic","1586","3523","7.9","lanthanoid","1880") );
        taulaPeriodicaCompleta.add(new cElement("65","Tb","Terbium","158.92535","[Xe] 4f9 6s2","1.2","None","92.3","None","566","-50","1,3 ,4","solid","metallic","1629","3503","8.22","lanthanoid","1843") );
        taulaPeriodicaCompleta.add(new cElement("66","Dy","Dysprosium","162.5","[Xe] 4f10 6s2","1.22","None","107","None","573","-50","2, 3","solid","metallic","1685","2840","8.55","lanthanoid","1886") );
        taulaPeriodicaCompleta.add(new cElement("67","Ho","Holmium","164.93032","[Xe] 4f11 6s2","1.23","None","90.1","None","581","-50","3","solid","metallic","1747","2973","8.8","lanthanoid","1878") );
        taulaPeriodicaCompleta.add(new cElement("68","Er","Erbium","167.259","[Xe] 4f12 6s2","1.24","None","89","None","589","-50","3","solid","metallic","1770","3141","9.07","lanthanoid","1842") );
        taulaPeriodicaCompleta.add(new cElement("69","Tm","Thulium","168.93421","[Xe] 4f13 6s2","1.25","None","103","None","597","-50","2, 3","solid","metallic","1818","2223","9.32","lanthanoid","1879") );
        taulaPeriodicaCompleta.add(new cElement("70","Yb","Ytterbium","173.054","[Xe] 4f14 6s2","1.1","None","102","None","603","-50","2, 3","solid","metallic","1092","1469","6.57","lanthanoid","1878") );
        taulaPeriodicaCompleta.add(new cElement("71","Lu","Lutetium","174.9668","[Xe] 4f14 5d1 6s2","1.27","160","86.1","None","524","-50","3","solid","metallic","1936","3675","9.84","transition metal","1907") );
        taulaPeriodicaCompleta.add(new cElement("72","Hf","Hafnium","178.49","[Xe] 4f14 5d2 6s2","1.3","150","71","None","659","0","2, 3, 4","solid","metallic","2506","4876","13.31","transition metal","1923") );
        taulaPeriodicaCompleta.add(new cElement("73","Ta","Tantalum","180.94788","[Xe] 4f14 5d3 6s2","1.5","138","72","None","761","-31","-1, 2, 3, 4, 5","solid","metallic","3290","5731","16.65","transition metal","1802") );
        taulaPeriodicaCompleta.add(new cElement("74","W","Tungsten","183.84","[Xe] 4f14 5d4 6s2","2.36","146","66","None","770","-79","-2, 1, 2, 3, 4, 5, 6","solid","metallic","3695","5828","19.25","transition metal","1783") );
        taulaPeriodicaCompleta.add(new cElement("75","Re","Rhenium","186.207","[Xe] 4f14 5d5 6s2","1.9","159","63","None","760","-15","-3, 1, 2, 3, 4, 5, 6, 7","solid","metallic","3459","5869","21.02","transition metal","1925") );
        taulaPeriodicaCompleta.add(new cElement("76","Os","Osmium","190.23","[Xe] 4f14 5d6 6s2","2.2","128","63","None","840","-106","-2, 1 ,2 ,3 ,4 ,5 ,6 ,7, 8","solid","metallic","3306","5285","22.59","transition metal","1803") );
        taulaPeriodicaCompleta.add(new cElement("77","Ir","Iridium","192.217","[Xe] 4f14 5d7 6s2","2.2","137","68","None","880","-151","-3, 1, 2, 3, 4, 5, 6","solid","metallic","2739","4701","22.56","transition metal","1803") );
        taulaPeriodicaCompleta.add(new cElement("78","Pt","Platinum","195.084","[Xe] 4f14 5d9 6s1","2.28","128","86","175","870","-205","2, 4, 6","solid","metallic","2041","4098","21.09","transition metal","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("79","Au","Gold","196.966569","[Xe] 4f14 5d10 6s1","2.54","144","137","166","890","-223","-1, 1, 2, 3, 4, 5","solid","metallic","1337","3129","19.3","transition metal","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("80","Hg","Mercury","200.59","[Xe] 4f14 5d10 6s2","2","149","119","155","1007","0","1, 2, 4","liquid","metallic","234","630","13.53","transition metal","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("81","Tl","Thallium","204.3833","[Xe] 4f14 5d10 6s2 6p1","2.04","148","150","196","589","-19","1, 3","solid","metallic","577","1746","11.85","metal","1861") );
        taulaPeriodicaCompleta.add(new cElement("82","Pb","Lead","207.2","[Xe] 4f14 5d10 6s2 6p2","2.33","147","119","202","716","-35","-4, 2, 4","solid","metallic","601","2022","11.34","metal","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("83","Bi","Bismuth","208.9804","[Xe] 4f14 5d10 6s2 6p3","2.02","146","103","None","703","-91","-3, 3, 5","solid","metallic","544","1837","9.78","metal","Unknown") );
        taulaPeriodicaCompleta.add(new cElement("84","Po","Polonium","209","[Xe] 4f14 5d10 6s2 6p4","2","None","94","None","812","-183","-2, 2, 4, 6","solid","metallic","527","1235","9.2","metalloid","1898") );
        taulaPeriodicaCompleta.add(new cElement("85","At","Astatine","210","[Xe] 4f14 5d10 6s2 6p5","2.2","None","62","None","920","-270","-1, 1, 3, 5","solid","covalent network","575","None","None","halogen","1940") );
        taulaPeriodicaCompleta.add(new cElement("86","Rn","Radon","222","[Xe] 4f14 5d10 6s2 6p6","None","145","None","None","1037","None","2","gas","atomic","202","211","0.01","noble gas","1900") );
        taulaPeriodicaCompleta.add(new cElement("87","Fr","Francium","223","[Rn] 7s1","0.7","None","180","None","380","None","1","solid","metallic","None","None","None","alkali metal","1939") );
        taulaPeriodicaCompleta.add(new cElement("88","Ra","Radium","226","[Rn] 7s2","0.9","None","148","None","509","None","2","solid","metallic","973","2010","5","alkaline earth metal","1898") );
        taulaPeriodicaCompleta.add(new cElement("89","Ac","Actinium","227","[Rn] 6d1 7s2","1.1","None","112","None","499","None","3","solid","metallic","1323","3473","10.07","actinoid","1899") );
        taulaPeriodicaCompleta.add(new cElement("90","Th","Thorium","232.03806","[Rn] 6d2 7s2","1.3","None","94","None","587","None","2, 3, 4","solid","metallic","2023","5093","11.72","actinoid","1828") );
        taulaPeriodicaCompleta.add(new cElement("91","Pa","Protactinium","231.03588","[Rn] 5f2 6d1 7s2","1.5","None","104","None","568","None","3, 4, 5","solid","metallic","1845","4273","15.37","actinoid","1913") );
        taulaPeriodicaCompleta.add(new cElement("92","U","Uranium","238.02891","[Rn] 5f3 6d1 7s2","1.38","None","102.5","186","598","None","3, 4, 5, 6","solid","metallic","1408","4200","19.05","actinoid","1789") );
        taulaPeriodicaCompleta.add(new cElement("93","Np","Neptunium","237","[Rn] 5f4 6d1 7s2","1.36","None","110","None","605","None","3, 4, 5, 6, 7","solid","metallic","917","4273","20.45","actinoid","1940") );
        taulaPeriodicaCompleta.add(new cElement("94","Pu","Plutonium","244","[Rn] 5f6 7s2","1.28","None","100","None","585","None","3, 4, 5, 6, 7","solid","metallic","913","3503","19.82","actinoid","1940") );
        taulaPeriodicaCompleta.add(new cElement("95","Am","Americium","243","[Rn] 5f7 7s2","1.3","None","126","None","578","None","2, 3, 4, 5, 6","solid","metallic","1449","2284","13.67","actinoid","1944") );
        taulaPeriodicaCompleta.add(new cElement("96","Cm","Curium","247","[Rn] 5f7 6d1 7s2","1.3","None","97","None","581","None","3, 4","solid","metallic","1618","3383","13.51","actinoid","1944") );
        taulaPeriodicaCompleta.add(new cElement("97","Bk","Berkelium","247","[Rn] 5f9 7s2","1.3","None","96","None","601","None","3, 4","solid","metallic","1323","None","14.78","actinoid","1949") );
        taulaPeriodicaCompleta.add(new cElement("98","Cf","Californium","251","[Rn] 5f10 7s2","1.3","None","95","None","608","None","2, 3, 4","solid","metallic","1173","None","15.1","actinoid","1950") );
        taulaPeriodicaCompleta.add(new cElement("99","Es","Einsteinium","252","[Rn] 5f11 7s2","1.3","None","None","None","619","None","2, 3","solid","","1133","None","None","actinoid","1952") );
        taulaPeriodicaCompleta.add(new cElement("100","Fm","Fermium","257","[Rn] 5f12 7s2","1.3","None","None","None","627","None","2, 3","None","None","1800","None","None","actinoid","1952") );
        taulaPeriodicaCompleta.add(new cElement("101","Md","Mendelevium","258","[Rn] 5f13 7s2","1.3","None","None","None","635","None","2, 3","None","None","1100","None","None","actinoid","1955") );
        taulaPeriodicaCompleta.add(new cElement("102","No","Nobelium","259","[Rn] 5f14 7s2","1.3","None","None","None","642","None","2, 3","None","None","1100","None","None","actinoid","1957") );
        taulaPeriodicaCompleta.add(new cElement("103","Lr","Lawrencium","262","[Rn] 5f14 7s2 7p1","1.3","None","None","None","None","None","3","None","None","1900","None","None","transition metal","1961") );
        taulaPeriodicaCompleta.add(new cElement("104","Rf","Rutherfordium","267","[Rn] 5f14 6d2 7s2","None","None","None","None","None","None","4","None","None","None","None","None","transition metal","1969") );
        taulaPeriodicaCompleta.add(new cElement("105","Db","Dubnium","268","[Rn].5f14.6d3.7s2","None","None","None","None","None","None","None","None","None","None","None","None","transition metal","1967") );
        taulaPeriodicaCompleta.add(new cElement("106","Sg","Seaborgium","271","[Rn].5f14.6d4.7s2","None","None","None","None","None","None","None","None","None","None","None","None","transition metal","1974") );
        taulaPeriodicaCompleta.add(new cElement("107","Bh","Bohrium","272","[Rn].5f14.6d5.7s2","None","None","None","None","None","None","None","None","None","None","None","None","transition metal","1976") );
        taulaPeriodicaCompleta.add(new cElement("108","Hs","Hassium","270","[Rn].5f14.6d6.7s2","None","None","None","None","None","None","None","None","None","None","None","None","transition metal","1984") );
        taulaPeriodicaCompleta.add(new cElement("109","Mt","Meitnerium","276","[Rn].5f14.6d7.7s2","None","None","None","None","None","None","None","None","None","None","None","None","transition metal","1982") );
        taulaPeriodicaCompleta.add(new cElement("110","Ds","Darmstadtium","281","[Rn].5f14.6d9.7s1","None","None","None","None","None","None","None","None","None","None","None","None","transition metal","1994") );
        taulaPeriodicaCompleta.add(new cElement("111","Rg","Roentgenium","280","[Rn].5f14.6d10.7s1","None","None","None","None","None","None","None","None","None","None","None","None","transition metal","1994") );
        taulaPeriodicaCompleta.add(new cElement("112","Cn","Copernicium","285","[Rn].5f14.6d10.7s2","None","None","None","None","None","None","None","None","None","None","None","None","transition metal","1996") );
        taulaPeriodicaCompleta.add(new cElement("113","Uut","Ununtrium","284","[Rn].5f14.6d10.7s2.7p1","None","None","None","None","None","None","None","None","None","None","None","None","metal","2003") );
        taulaPeriodicaCompleta.add(new cElement("114","Uuq","Ununquadium","289","[Rn].5f14.6d10.7s2.7p2","None","None","None","None","None","None","None","None","None","None","None","None","metal","1998") );
        taulaPeriodicaCompleta.add(new cElement("115","Uup","Ununpentium","288","[Rn].5f14.6d10.7s2.7p3","None","None","None","None","None","None","None","None","None","None","None","None","halogen","2003") );
        taulaPeriodicaCompleta.add(new cElement("116","Uuh","Ununhexium","293","[Rn].5f14.6d10.7s2.7p4","None","None","None","None","None","None","None","None","None","None","None","None","noble gas","2000") );
        taulaPeriodicaCompleta.add(new cElement("117","Uus","Ununseptium","293","[Rn].5f14.6d10.7s2.7p5","None","None","None","None","None","None","None","None","None","None","None","None","alkali metal","2010") );
        taulaPeriodicaCompleta.add(new cElement("118","Uuo","Ununoctium","294","[Rn].5f14.6d10.7s2.7p6","None","None","None","None","None","None","None","None","None","None","None","None","alkaline earth metal","2002") );

        ActionBar actionBar = getSupportActionBar();

        actionBar.setTitle("Periodic Table");

        PeriodicTableAdapter adaptador = new PeriodicTableAdapter(MainActivity.this, taulaPeriodica );

        ListView lst = (ListView)findViewById(R.id.listCustom);
        lst.setAdapter(adaptador);


        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int position, long arg3) {
                Intent intentDetallActivity = new Intent(MainActivity.this, DetallActivity.class);
                intentDetallActivity.putExtra("element", taulaPeriodica.get(position) );
                startActivityForResult(intentDetallActivity,1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main__layout_menu, menu);
        return true;
    }

    // Capturar pulsacions en el menú de la barra superior.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                finish();
                return true;

            case R.id.menuItemNoFilter:


                return true;
            case R.id.menuItemSolid:



                return true;
            case R.id.menuItemLiquid:


                return true;
            case R.id.menuItemGas:


                return true;

            case R.id.menuItemSynthetic:



                return true;
        }
        return super.onOptionsItemSelected(item);


    }

class PeriodicTableAdapter extends ArrayAdapter<cElement> {

    public PeriodicTableAdapter(Context context, ArrayList<cElement> taula) {
        super(context, R.layout.main_activity_layout, taula);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.main_activity_layout, null);

        cElement element = (cElement) getItem(position);
        String standardStateString = element.getStandardState();

        TextView edt = (TextView)item.findViewById(R.id.edtNumber);
        edt.setText(element.getNumber() );

        edt = (TextView)item.findViewById(R.id.edtSymbol);
        edt.setText(element.getSymbol() );

        edt = (TextView)item.findViewById(R.id.edtName);
        edt.setText(element.getName() );

        edt = (TextView)item.findViewById(R.id.edtMass);
        edt.setText(element.getMass() );

        edt = (TextView)item.findViewById(R.id.edtTypeSC);
        edt.setText(standardStateString );

        switch (standardStateString) {
            case "solid": item.setBackgroundColor(Color.YELLOW); break;
            case "liquid": item.setBackgroundColor(Color.BLUE); break;
            case "gas": item.setBackgroundColor(Color.GREEN); break;
            case "synthetic": item.setBackgroundColor(Color.RED); break;
        }
        return(item);
    }

    }
}