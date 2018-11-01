public class halaman1 extends Fragment {
public halaman1() {
// Required empty public constructor
}
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
}
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
Bundle savedInstanceState) {
// Inflate the layout for this fragment
// halaman1 merujuk pada file halaman1.xml
return inflater.inflate(R.layout.halaman1, container, false);
}
}
