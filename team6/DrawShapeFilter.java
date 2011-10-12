class DrawShapeFilter {

		/**
				 * @param args
				 		 */
						 		public static void main(String[] args) {
											// TODO Auto-generated method stub
														
																	for(int i=1;i<=5;i++)
																				{
																								double area=Rectangle.genRectangle();
																												if(area > 10)
																															System.out.println("rect ["+i+ "] "+ area);
																																			 area=Circle.genCircle();
																																			 				if(area > 10)
																																												System.out.println("circle ["+i+"] "+area);
																																																 area=Square.genSquare();
																																																 				if(area > 10)
																																																									System.out.println("square ["+i+"] "+area);
																																																												
																																																															}
																																																																	}

																																																																		}
