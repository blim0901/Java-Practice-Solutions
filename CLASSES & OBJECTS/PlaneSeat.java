package lab3plane;

public class PlaneSeat {

		private int seatId;
		private boolean assigned = false;
		private int customerId;
		
		
		public PlaneSeat(int seat_id) {
			this.seatId = seat_id;
			this.customerId = -1;
		}
		
		public int getSeatID() {
			return this.seatId;
		}
		
		public int getCustomerID() {
			return this.customerId;
		}
		
		public boolean isOccupied() {
			return this.assigned;
		}
		
		public void assign(int customerId) {
			this.customerId = customerId;
			this.assigned = true;
		}
		
		public void unAssign() {
			this.customerId = -1;
			this.assigned = false;
		}
		
}
