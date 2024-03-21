'''
Created on Mar 20, 2024

@author: alexxavier
'''
class HW11:
    def floodFill(self, image, sr, sc, color):
        if image[sr][sc] == color:
            return image
        self.fill(image, sr, sc, image[sr][sc], color)
        return image

    def fill(self, image, sr, sc, org, color):
        if sr >= 0 and sc >= 0 and sr < len(image) and sc < len(image[0]) and image[sr][sc] == org:
            image[sr][sc] = color

            self.fill(image, sr - 1, sc, org, color)
            self.fill(image, sr + 1, sc, org, color)
            self.fill(image, sr, sc - 1, org, color)
            self.fill(image, sr, sc + 1, org, color)

    @staticmethod
    def printImage(image):
        for row in image:
            for pixel in row:
                print(pixel, end=' ')
            print()

    def main(self):
        x = HW11()
        image = [[1, 1, 1], [1, 1, 0], [1, 0, 1]]
        sr = 1
        sc = 1
        newColor = 2

        print("Original Image:")
        self.printImage(image)
        print()

        filledImage = x.floodFill(image, sr, sc, newColor)

        print("Image after flood fill:")
        self.printImage(filledImage)


if __name__ == "__main__":
    hw_obj = HW11()
    hw_obj.main()
