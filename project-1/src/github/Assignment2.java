package github;

class SubsetArray
{
	static boolean isSubset(int sub1[], int sub2[], int m, int n2)
	{
		int i=0;
		int j=0;

		for(i=0;i<n2;i++)
		{
			for(j=0;j<m;j++)
				if(sub2[i]==sub1[j])
					break;
			if(j==m)
				return false;
		}
		return true;
	}
}


class SelectionSort
{
	void sort(int sel[])
	{
		int n = sel.length;
		
		for(int i=0;i<n-1;i++)
		{
			int minElem=i;
			for(int j=i+1;j<n;j++)
				if(sel[j]<sel[minElem])
					minElem=j;
			
			int tempVar = sel[minElem];
			sel[minElem]=sel[i];
			sel[i]=tempVar;
		}
	}
	
    void printArray(int sel[])
    {
        int n = sel.length;
        for (int i=0; i<n; ++i)
            System.out.print(sel[i]+" ");
        System.out.println();
    }
}

class MergeSort
{
	void merge(int a3[], int left, int mid, int right) 
	{
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int tempLeft[] = new int[n1];
		int tempRight[] = new int[n2];
		
		for(int i=0;i<n1;++i)
			tempLeft[i] = a3[left + i];
		for(int j=0;j<n2;++j)
			tempRight[j] = a3[mid+1+j];
		
		int i=0, j=0;
		
		int k=left;
		while(i<n1&&j<n2)
		{
			if (tempLeft[i] <= tempRight[j])
			{
				a3[k] = tempLeft[i];
				i++;
			}
			else
			{
				a3[k] = tempRight[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			a3[k]=tempLeft[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a3[k] = tempRight[j];
			j++;
			k++;
		}
	}
	
	void sort(int a3[], int left, int right)
	{
		if(left<right)
		{
			int mid = left+(right-left)/2;
			sort(a3, left, mid);
			sort(a3,mid+1,right);
			
			merge(a3,left,mid,right);
		}
	}
	
	
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

class QuickSort
{
	int partition(int a2[], int low, int high)
	{
		int pivot = a2[high];
		int i = (low-1);
		for(int j=low;j<high;j++)
		{
			if(a2[j] <= pivot)
			{
				i++;
				int tempVar = a2[i];
				a2[i]=a2[j];
				a2[j]=tempVar;
			}
		}
		
		int tempVar=a2[i+1];
		a2[i+1]=a2[high];
		a2[high]=tempVar;
		
		return i+1;
	}
	void sort(int a2[], int low, int high)
	{
		if(low<high)
		{
			int pi=partition(a2, low, high);  //pi = partition index
			sort(a2, low, pi-1);
			sort(a2, pi+1, high);
		}
	}
	static void printArray(int a2[])
	{
		int n=a2.length;
		for(int i=0;i<n;++i)
			System.out.print(a2[i]+" ");
		System.out.println();
	}
}

public class Assignment2 {

	public static void main(String[] args) {
//bubble sort
		int[] a= {33,6,88,745,6,11,32,87,746,744,1};
		
		for(int ele:a)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-i;j++)
			{
				if(a[j]<a[j-1])
				{
					int tempVar=a[j];
					a[j]=a[j-1];
					a[j-1]=tempVar;
				}
			}
		}
		System.out.println("bubble sorted array:");
		for(int ele:a)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		System.out.println();
		
// quick sort
		int[] a2= {33,6,88,745,6,11,32,87,746,744,1};
		
		int n=a2.length;
		
		for(int ele:a2)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		
		QuickSort qs = new QuickSort();
		qs.sort(a2,  0,  n-1);
		
		System.out.println("quick sorted array:");
		qs.printArray(a2);
		
		System.out.println();
		System.out.println();
		
//merge sort
		int[] a3= {33,6,88,745,6,11,32,87,746,744,1};
		
		for(int ele:a3)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		
		MergeSort ms = new MergeSort();
		ms.sort(a3, 0, a3.length-1);
		System.out.println("merge sorted array");
		
		ms.printArray(a3);
		
		System.out.println();
		System.out.println();
		
//selection sort
		int[] sel= {33,6,88,745,6,11,32,87,746,744,1};

		
		for(int ele:sel)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		SelectionSort ss=new SelectionSort();
		ss.sort(sel);
		System.out.println("selection sorted array");
		ss.printArray(sel);
		System.out.println();
		
//check whether an array is a subset of another array
        int sub1[] = { 11, 1, 13, 21, 3, 7 };
        int sub2[] = { 11, 3, 7, 1 };
		for(int ele:sub1)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		for(int ele:sub2)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		System.out.println();
        int m = sub1.length;
        int n2 = sub2.length;
        SubsetArray sa= new SubsetArray();

 
        if (sa.isSubset(sub1, sub2, m, n2))
            System.out.print("sub2[] is "
                             + "subset of sub1[] ");
        else
            System.out.print("sub2[] is "
                             + "not a subset of sub1[]");
		
		
	}

}
